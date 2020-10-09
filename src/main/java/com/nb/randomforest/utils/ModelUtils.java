package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;
import org.apache.commons.lang3.StringUtils;
import weka.classifiers.trees.RandomForest;

import weka.classifiers.Evaluation;
import weka.core.*;
import weka.core.converters.ArffLoader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class ModelUtils {
    
    public static final ObjectMapper mapper = new ObjectMapper();
    

    /**
     * Load data set
     */
    public static Instances getDataSet(String fileName) throws IOException {
        int classIdx = 1;
        ArffLoader loader = new ArffLoader();
        loader.setSource(new FileInputStream(new File(fileName)));
        Instances dataSet = loader.getDataSet();
        dataSet.setClassIndex(classIdx);
        return dataSet;
    }

    /**
     * Model training and estimate based on train, test file.
     */
    public static void train(String trainFile, String testFile) throws Exception {
        Instances trainingDataSet = getDataSet(trainFile);
        trainingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);
        Instances testingDataSet = getDataSet(testFile);
        testingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);

        RandomForest forest = new RandomForest();
        forest.setNumIterations(10);
        forest.setDebug(false);
        forest.setNumFeatures(2);
        forest.setMaxDepth(0);
        forest.buildClassifier(trainingDataSet);
    
        Evaluation eval = new Evaluation(trainingDataSet);
        eval.evaluateModel(forest, testingDataSet);
    
        

        /** Print the algorithm summary */
        System.out.println("** Decision Tress Evaluation with Datasets **");
        System.out.println(eval.toSummaryString());
        System.out.print(" the expression for the input data as per alogorithm is ");
        System.out.println(forest);
        
        // dump random forest model to file
        SerializationHelper.write(Paths.get(new File(trainFile).getParent(),"forest.model").toString(), forest);

    }
    
    
    /**
     *
     */
    public static void predict() throws Exception {
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/src/main/resources/forest.model");
    
        // we need those for creating new instances later
        final Attribute OverlapRatioORG = new Attribute("OverlapRatioORG");
        final Attribute OverlapRatioLOC = new Attribute("OverlapRatioLOC");
        final Attribute OverlapRatioPRS = new Attribute("OverlapRatioPRS");
        final List<String> classes = new ArrayList<String>() {
            {
                add("DIFF");
                add("EVENT");
                add("DUP");
            }
        };
    
        // Instances(...) requires ArrayList<> instead of List<>...
        ArrayList<Attribute> attributeList = new ArrayList<Attribute>(2) {
            {
                add(OverlapRatioORG);
                add(OverlapRatioLOC);
                add(OverlapRatioPRS);
                Attribute attributeClass = new Attribute("Label", classes);
                add(attributeClass);
            }
        };
        // unpredicted data sets (reference to sample structure for new instances)
        Instances dataUnpredicted = new Instances("TestInstances",
            attributeList, 1);
        // last feature is target variable
        dataUnpredicted.setClassIndex(dataUnpredicted.numAttributes() - 1);
    
        // create new instance: this one should fall into the setosa domain
        DenseInstance newInstanceSetosa = new DenseInstance(dataUnpredicted.numAttributes()) {
            {
                setValue(OverlapRatioORG, 9);
                setValue(OverlapRatioLOC, 8.5);
                setValue(OverlapRatioPRS, 9);
            }
        };
    
        // instance to use in prediction
        DenseInstance newInstance = newInstanceSetosa;
        // reference to dataset
        newInstance.setDataset(dataUnpredicted);
    
        // predict new sample
        try {
            double result = forest.classifyInstance(newInstance);
            System.out.println("Index of predicted class label: " + result + ", which corresponds to class: " + classes.get(new Double(result).intValue()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    
    /**
     * 基于 DOC Field 文件计算 Precision, Recall
     */
    public static void predictABTestBasedDocField(RandomForest forest, String sourceFile) throws Exception {
        return;
    }
    
    
    /**
     * 基于 ARFF 文件计算 Precision, Recall
     */
    public static void predictABTestBasedARFF(RandomForest forest, String sourceFile, String docPairFile) throws Exception {
        DataSource dataSource = new DataSource(sourceFile);
        Instances testDataset = dataSource.getDataSet();
        testDataset.setClassIndex(testDataset.numAttributes() - 1);
    
        BufferedReader br = new BufferedReader(new FileReader(new File(docPairFile)));
        String line = null;
        int j = 22;
        Map<Integer, String> indexDocMap = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] docPairFields = line.split("\t");
            String isSuccess = docPairFields[3];
            if (StringUtils.equals(isSuccess, "SUCCESS")) {
                indexDocMap.put(j, docPairFields[0] + "\t" + docPairFields[1]);
                j++;
            }
        }

        //Real Positive
        int rpEVT = 0;
        int rpDUP = 0;
        //True Positive
        int tpDIF = 0;
        int tpEVT = 0;
        int tpDUP = 0;
        //Predict Positive
        int ppEVT = 0;
        int ppDUP = 0;
        
        Attribute clsAttribute = testDataset.classAttribute();
        int i = 22;
        //逐个计算
        for (Instance instance : testDataset) {
            String pCls = clsAttribute.value(Double.valueOf(forest.classifyInstance(instance)).intValue());
            String rCls = clsAttribute.value(Double.valueOf(instance.value(instance.classIndex())).intValue());
            if (StringUtils.equals(pCls, "EVENT")) {
                ppEVT++;
                if (StringUtils.equals(rCls, pCls)) {
                    tpEVT++;
                }
            } else if (StringUtils.equals(pCls, "DUP")) {
                ppDUP++;
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            }
            
            if (StringUtils.equals(rCls, "DUP")) {
                rpDUP++;
            } else if (StringUtils.equals(rCls, "EVENT")) {
                rpEVT++;
            }
            
            if (!StringUtils.equals(rCls, pCls)) {
                System.out.println(indexDocMap.get(i) + "\t" + rCls + "\t" + pCls);
            }
            i++;
        }
        
        double tprDUP = tpDUP / Double.valueOf(ppDUP);
        double rcrDUP = tpDUP / Double.valueOf(rpDUP);
        System.out.println("## TPR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(ppDUP) + "=" + String.valueOf(tprDUP));
        System.out.println("## RCR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(rpDUP) + "=" + String.valueOf(rcrDUP));
        double tprEVT = tpEVT / Double.valueOf(ppEVT);
        double rcrEVT = tpEVT / Double.valueOf(rpEVT);
        System.out.println("## TPR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(ppEVT) + "=" + String.valueOf(tprEVT));
        System.out.println("## RCR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(rpEVT) + "=" + String.valueOf(rcrEVT));


//        //batch 模式
//        String[] strs = new String[]{"DIFF", "EVENT", "DUP"};
//        double[][] results = forest.distributionsForInstances(testDataset);
//        for (int j = 0; j < results.length; j++) {
//            double[] distributes = results[j];
//            int max = 0;
//            for (int i = 1; i < distributes.length; i++) {
//                if (distributes[i] > distributes[max]) {
//                    max = i;
//                }
//            }
//            System.out.println(String.valueOf(j) + "\t:\t" + strs[max]);
//        }
    }
    
    
    /**
     *
     */
    public static void predictOnline(RandomForest forest, String master, List<String> candidates) throws Exception {
        Long start = System.currentTimeMillis();
        ArrayList<Attribute> attributes = new ArrayList<>();
        ArrayList<String> attVals = new ArrayList<>();
        Instances instances;
    
        // - numeric
        attributes.add(new Attribute("TitleDist"));
        attributes.add(new Attribute("SameSRC"));
        attributes.add(new Attribute("CWordSpan"));
        attributes.add(new Attribute("EpochSpan"));
        attributes.add(new Attribute("ParghSpan"));
        attributes.add(new Attribute("SimhashDist"));
        attributes.add(new Attribute("KWSRatio"));
        attributes.add(new Attribute("ChannelRatio"));
        attributes.add(new Attribute("COrgOverlapRatio"));
        attributes.add(new Attribute("CLocOverlapRatio"));
        attributes.add(new Attribute("CPrsOverlapRatio"));
        attributes.add(new Attribute("TOrgOverlapRatio"));
        attributes.add(new Attribute("TLocOverlapRatio"));
        attributes.add(new Attribute("TPrsOverlapRatio"));
        attributes.add(new Attribute("CatOverlapRatio"));
        attributes.add(new Attribute("GEOOverlapRatio"));
        // - nominal
        attVals.add("DIFF");
        attVals.add("EVENT");
        attVals.add("DUP");
        attributes.add(new Attribute("Label", attVals));
        
        // 2. create Instances object
        instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
        instances.setClassIndex(instances.numAttributes() - 1);
        JsonNode masterNode = mapper.readTree(master);
        for (String candidate : candidates) {
            JsonNode candiNode = mapper.readTree(candidate);
            instances.add(new EventFeature(masterNode, candiNode, null).toInstance());
        }
        // 3.
        double[][] result = forest.distributionsForInstances(instances);
        for (double[] doubles : result) {
            for (double aDouble : doubles) {
                System.out.print(aDouble);
                System.out.print("\t||\t");
            }
            System.out.println();
        }
    
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws Exception {
        
        /** Model Training */
//        String trainFile = "/Users/yuxi/NB/RandomForest/_local/train/20200929/train.arff";
//        String testFile = "/Users/yuxi/NB/RandomForest/_local/train/20200929/test.arff";
//        train(trainFile, testFile);
        
        /** Model Inference ABTEST*/
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/_local/train/20200929/forest.model");
        predictABTestBasedARFF(forest, "/Users/yuxi/NB/RandomForest/_local/train/20200929/test.arff", "/Users/yuxi/NB/RandomForest/_local/train/20200929/test_fields_1614");
        
        /** Model Inference ONLINE */
//        String masterStr = "{\"_id\": \"0WxXFOiG\", \"c_word\": 184, \"channels_v2\": [\"Ohio^^Stadium\", \"Ohio^^State\", \"Home^^Game\", \"Buckeye\", \"Football^^Season\", \"Football\", \"Ohio\"], \"epoch\": {\"$numberLong\": \"1599975420\"}, \"geotag_v2\": [{\"name\": \"columbus\", \"score\": 1.0, \"coord\": \"39.961176,-82.998794\", \"pid\": \"columbus,ohio\", \"type\": \"city\"}], \"kws\": [\"Buckeye^^football^^fans\", \"football^^fans\", \"football^^season\", \"Ohio^^Stadium\", \"home^^game\", \"Ohio^^State^^University\", \"COLUMBUS\", \"happy\", \"fall\", \"Competition^^Task^^Force\", \"petitions\"], \"ne_content_location\": {\"Buckeye\": 1, \"Ohio\": 2, \"COLUMBUS\": 1, \"Ohio Stadium\": 1}, \"ne_content_organization\": {\"Competition Task Force\": 1, \"Ohio State\": 1, \"Ohio State University\": 1, \"Associated Press\": 1}, \"ne_content_person\": {}, \"ne_title_location\": {\"Buckeye\": 1}, \"ne_title_organization\": {}, \"ne_title_person\": {}, \"paragraph_count\": 7.0, \"simhash\": \"9a9543b818dcd5c37b9ee3b2e2e4778b\", \"src\": \"WTOL-TV\", \"stitle\": \"Buckeye fans disappointed to not have football for what would have been first home game\", \"text_category_v2\": {\"first_cat\": {\"Sports\": 0.9428178147314257}, \"second_cat\": {\"Sports_AmericanFootball\": 0.7154466756639957, \"Sports_College\": 0.6156932023454093}, \"third_cat\": {\"Sports_AmericanFootball_Other\": 0.7154466756639957, \"Sports_College_Other\": 0.6156932023454093}}}";
//        String canditStr = "{\"_id\": \"0WoFOOxs\", \"c_word\": 193, \"channels_v2\": [\"Ohio^^State^^football\", \"Ohio^^State\", \"Shooting\", \"Defensive^^Tackle\", \"Chittenden\", \"Vermont\", \"Shell^^Casings\", \"Garrett\"], \"epoch\": {\"$numberLong\": \"1598791224\"}, \"geotag_v2\": [{\"name\": \"ohio\", \"score\": 1.0, \"pid\": \"ohio\", \"type\": \"state\"}, {\"name\": \"columbus\", \"score\": 0.989151120185852, \"coord\": \"39.961176,-82.998794\", \"pid\": \"columbus,ohio\", \"type\": \"city\"}], \"kws\": [\"Ohio^^State^^football\", \"Ohio^^State^^University\", \"Columbus^^Police\", \"shooting\", \"Columbus^^Fire\", \"Police\", \"COLUMBUS\", \"22-year-old^^Garrett^^suffering\", \"suspect\", \"East^^11th^^Avenue\", \"Chittenden^^Ave.^^Officers\", \"Fire\", \"Haskell^^Garrett\", \"Vermont\", \"ABC\", \"Stubblefield\", \"Haskell\", \"614-461-TIPS\"], \"ne_content_location\": {\"Vermont\": 1, \"Chittenden\": 1, \"Ohio\": 2, \"East 11th Avenue\": 1, \"COLUMBUS\": 1, \"Ohio State Football\": 1}, \"ne_content_organization\": {\"Columbus Fire\": 1, \"Ohio State University Hospital\": 1, \"ABC\": 1, \"Columbus Police\": 2, \"Columbus Police Felony Assault Detective Stubblefield\": 1, \"Ohio State\": 1, \"Central Ohio Crime Stoppers\": 1}, \"ne_content_person\": {\"Haskell Garrett\": 1, \"Garrett\": 3}, \"ne_title_location\": {}, \"ne_title_organization\": {\"Ohio State\": 1}, \"ne_title_person\": {}, \"paragraph_count\": 8.0, \"simhash\": \"4fe1f8bba9e9102229d9a2912860771e\", \"src\": \"myfox28columbus.com\", \"stitle\": \"Ohio State football player injured in overnight shooting near campus\", \"text_category_v2\": {\"first_cat\": {\"CrimePublicsafety\": 0.6951286280185068, \"Sports\": 0.8214851472643709}, \"second_cat\": {\"CrimePublicsafety_ViolentCrime\": 0.6015757232239475, \"Sports_Other\": 0.8214851472643709}, \"third_cat\": {\"CrimePublicsafety_ViolentCrime_Other\": 0.6015757232239475}}}";
//        predictOnline(forest, masterStr, Arrays.asList(new String[]{canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr, canditStr, masterStr}));
        
    }
}