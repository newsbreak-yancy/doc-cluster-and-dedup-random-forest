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
     * 半监督学习 : 基于构建的半监督数据 + 训练数据 训练模型
     * 训练方式一 : 先基于半监督数据训练, 再基于训练数据训练 传统 fine tuning 方式, 但是不适用 RandomForest?
     * 训练方式二 : 混合半监督数据 + 训练数据, 通过调整混合比例及方式起到 fine tuning 的作用
     */
    public static void trainModelSemiSupervised(String semiSupFile, String trainFile, String testFile) throws Exception {
        //semi supervised data set
        Instances trainingDataSetSemiSupervised = getDataSet(semiSupFile);
        trainingDataSetSemiSupervised.setClassIndex(trainingDataSetSemiSupervised.numAttributes() - 1);
        
        //
        Instances trainingDataSet = getDataSet(trainFile);
        trainingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);
        
        //test data set
        Instances testingDataSet = getDataSet(testFile);
        testingDataSet.setClassIndex(trainingDataSetSemiSupervised.numAttributes() - 1);
    
        RandomForest forest = new RandomForest();
        forest.setBatchSize("200");
        forest.setNumIterations(200);
        forest.setDebug(false);
        forest.setNumFeatures(4); // random feature num = log_2{feature num}
        forest.setComputeAttributeImportance(true);
        //
        forest.buildClassifier(trainingDataSetSemiSupervised);
        
        //NOTE : 无效
        forest.setClassifier(forest.getClassifier());
        forest.buildClassifier(trainingDataSet);
    
        Evaluation eval = new Evaluation(trainingDataSetSemiSupervised);
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
     * Model training and estimate based on train, test file.
     */
    public static void trainModel(String trainFile, String testFile) throws Exception {
        Instances trainingDataSet = getDataSet(trainFile);
        trainingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);
        Instances testingDataSet = getDataSet(testFile);
        testingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);

        RandomForest forest = new RandomForest();
        forest.setNumIterations(300);
        forest.setDebug(false);
        forest.setNumFeatures(8); // random feature num = log_2{feature num}
        forest.setComputeAttributeImportance(true);
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
        String badpath = Paths.get(Paths.get(sourceFile).getParent().toString(), "badcase").toString();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(badpath)));
        Instances testDataset = dataSource.getDataSet();
        testDataset.setClassIndex(testDataset.numAttributes() - 1);
    
        BufferedReader br = new BufferedReader(new FileReader(new File(docPairFile)));
        String line = null;
        int j = 22;
        Map<Integer, String> indexDocMap = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] docPairFields = line.split("\t");
            indexDocMap.put(j, docPairFields[0] + "\t" + docPairFields[1]);
            j++;
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
        int i = 22;//打印时便于找到 arff 中对应的结果
        //逐个计算
        bw.write("Master\t\tCandidate\tDIF_WEIGHT\tEVT_WEIGHT\tDUP_WEIGHT\tPredict\tReal");
        bw.write("\n");
        for (Instance instance : testDataset) {
            double[] distribute = forest.distributionForInstance(instance);
            double difScr = distribute[0];
            double evtScr = distribute[1];
            double dupScr = distribute[2];
            
            String pCls = "";
            String rCls = clsAttribute.value(Double.valueOf(instance.value(instance.classIndex())).intValue());
            if (difScr < 0.56d && dupScr < 0.7d) {//EVENT
                ppEVT++;
                pCls = "EVENT";
                if (StringUtils.equals(rCls, "EVENT")) {
                    tpEVT++;
                }
            } else if (dupScr >= 0.7d) {//DUP
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, "DUP")) {
                    tpDUP++;
                }
            } else {
                pCls = "DIFF";
            }
            
            if (StringUtils.equals(rCls, "DUP")) {
                rpDUP++;
            } else if (StringUtils.equals(rCls, "EVENT")) {
                rpEVT++;
            }
            bw.write(indexDocMap.get(i) + "\t" + String.valueOf(difScr) + "\t" + String.valueOf(evtScr) + "\t" + String.valueOf(dupScr) + "\t" + pCls + "\t" + rCls);
            bw.write("\n");
            i++;
        }
        bw.close();
        
        double tprDUP = tpDUP / Double.valueOf(ppDUP);
        double rcrDUP = tpDUP / Double.valueOf(rpDUP);
        System.out.println("## TPR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(ppDUP) + "=" + String.valueOf(tprDUP));
        System.out.println("## RCR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(rpDUP) + "=" + String.valueOf(rcrDUP));
        double tprEVT = tpEVT / Double.valueOf(ppEVT);
        double rcrEVT = tpEVT / Double.valueOf(rpEVT);
        System.out.println("## TPR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(ppEVT) + "=" + String.valueOf(tprEVT));
        System.out.println("## RCR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(rpEVT) + "=" + String.valueOf(rcrEVT));
    }
    
    
    /**
     * 基于 Feature V1(16) + Estimate Data => Model Estimate
     *
     */
    public static void predictEstimateDataFeatureV0(RandomForest forest, String docPairFile) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<Attribute> attributes = new ArrayList<>();
        ArrayList<String> attVals = new ArrayList<>();
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
        attributes.add(new Attribute("Label", attVals));
        //
        //Real Positive
        int rpDUP = 0;
        int rpEVT = 0;
        //True Positive
        int tpDIF = 0;
        int tpEVT = 0;
        int tpDUP = 0;
        //Predict Positive
        int ppEVT = 0;
        int ppDUP = 0;
        //
        BufferedReader br = new BufferedReader(new FileReader(new File(docPairFile)));
        String badpath = Paths.get(Paths.get(docPairFile).getParent().toString(), "badcase").toString();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(badpath)));
        bw.write("Master\t\tCandidate\tDIF_WEIGHT\tEVT_WEIGHT\tPredict\tReal");
        bw.write("\n");
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] docPairFields = line.split("\t");
            String mDoc = docPairFields[0];
            String cDoc = docPairFields[1];
            String pCls = "";
            String rCls = docPairFields[2];
            JsonNode mNode = objectMapper.readTree(docPairFields[4]);
            JsonNode cNode = objectMapper.readTree(docPairFields[5]);
            EventFeature feature = new EventFeature(mNode, cNode, rCls);
            Instances instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
            instances.setClassIndex(instances.numAttributes() - 1);
            instances.add(feature.toInstanceV0());
            double[] distribute = forest.distributionsForInstances(instances)[0];
            double difScr = distribute[0];
            double evtScr = distribute[1];
            if (evtScr > 0.92) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.58) {//EVENT
                if (!StringUtils.equals(rCls, "DUP")) {
                    ppEVT++;
                }
                pCls = "EVENT";
                if (StringUtils.equals(rCls, "EVENT")) {
                    tpEVT++;
                }
            } else {
                pCls = "DIFF";
            }
    
            if (StringUtils.equals(rCls, "EVENT")) {
                rpEVT++;
            }
            if (StringUtils.equals(rCls, "DUP")) {
                rpDUP++;
            }
    
            if (!StringUtils.equals(rCls, pCls)) {
                bw.write(mDoc + "\t" + cDoc + "\t" + String.valueOf(difScr) + "\t" + String.valueOf(evtScr) + "\t" + pCls + "\t" + rCls);
                bw.write("\n");
            }
        }
        
        bw.close();

        double tprDUP = tpDUP / Double.valueOf(ppDUP);
        double rcrDUP = tpDUP / Double.valueOf(rpDUP);
        System.out.println("## TPR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(ppDUP) + "=" + String.valueOf(tprDUP));
        System.out.println("## RCR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(rpDUP) + "=" + String.valueOf(rcrDUP));

        double tprEVT = tpEVT / Double.valueOf(ppEVT);
        double rcrEVT = tpEVT / Double.valueOf(rpEVT);
        System.out.println("## TPR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(ppEVT) + "=" + String.valueOf(tprEVT));
        System.out.println("## RCR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(rpEVT) + "=" + String.valueOf(rcrEVT));
    }
    
    
    /**
     * 基于 Feature V1(53) + Estimate Data => Model Estimate
     *
     */
    public static void predictEstimateDataFeatureV1(RandomForest forest, String docPairFile) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributesV1();
        //Real Positive
        int rpDUP = 0;
        int rpEVT = 0;
        //True Positive
        int tpDIF = 0;
        int tpEVT = 0;
        int tpDUP = 0;
        //Predict Positive
        int ppEVT = 0;
        int ppDUP = 0;
        //
        BufferedReader br = new BufferedReader(new FileReader(new File(docPairFile)));
        String badpath = Paths.get(Paths.get(docPairFile).getParent().toString(), "badcase").toString();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(badpath)));
        bw.write("Master\t\tCandidate\tDIF_WEIGHT\tEVT_WEIGHT\tPredict\tReal");
        bw.write("\n");
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] docPairFields = line.split("\t");
            String mDoc = docPairFields[0];
            String cDoc = docPairFields[1];
            String pCls = "";
            String rCls = docPairFields[2];
            JsonNode mNode = objectMapper.readTree(docPairFields[4]);
            JsonNode cNode = objectMapper.readTree(docPairFields[5]);
            EventFeature feature = new EventFeature(mNode, cNode, rCls);
            Instances instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
            instances.setClassIndex(instances.numAttributes() - 1);
            instances.add(feature.toInstanceV1());
            double[] distribute = forest.distributionsForInstances(instances)[0];
            double difScr = distribute[0];
            double evtScr = distribute[1];
            if (evtScr > 0.9) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.45) {//EVENT
                if (!StringUtils.equals(rCls, "DUP")) {
                    ppEVT++;
                }
                pCls = "EVENT";
                if (StringUtils.equals(rCls, "EVENT")) {
                    tpEVT++;
                }
            } else {
                pCls = "DIFF";
            }
            
            if (StringUtils.equals(rCls, "EVENT")) {
                rpEVT++;
            }
            if (StringUtils.equals(rCls, "DUP")) {
                rpDUP++;
            }
            
            if (!StringUtils.equals(rCls, pCls)) {
                bw.write(mDoc + "\t" + cDoc + "\t" + String.valueOf(difScr) + "\t" + String.valueOf(evtScr) + "\t" + pCls + "\t" + rCls);
                bw.write("\n");
            }
        }
        
        bw.close();
        
        double tprDUP = tpDUP / Double.valueOf(ppDUP);
        double rcrDUP = tpDUP / Double.valueOf(rpDUP);
        System.out.println("## TPR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(ppDUP) + "=" + String.valueOf(tprDUP));
        System.out.println("## RCR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(rpDUP) + "=" + String.valueOf(rcrDUP));
        
        double tprEVT = tpEVT / Double.valueOf(ppEVT);
        double rcrEVT = tpEVT / Double.valueOf(rpEVT);
        System.out.println("## TPR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(ppEVT) + "=" + String.valueOf(tprEVT));
        System.out.println("## RCR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(rpEVT) + "=" + String.valueOf(rcrEVT));
    }
    
    
    /**
     * 基于 Feature V1(53) + Estimate Data => Model Estimate
     *
     */
    public static void predictEstimateDataFeatureV2(RandomForest forest, String docPairFile) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributesV2();
        //
        //Real Positive
        int rpDUP = 0;
        int rpEVT = 0;
        //True Positive
        int tpDIF = 0;
        int tpEVT = 0;
        int tpDUP = 0;
        //Predict Positive
        int ppEVT = 0;
        int ppDUP = 0;
        //
        BufferedReader br = new BufferedReader(new FileReader(new File(docPairFile)));
        String badpath = Paths.get(Paths.get(docPairFile).getParent().toString(), "badcase").toString();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(badpath)));
        bw.write("Master\t\tCandidate\tDIF_WEIGHT\tEVT_WEIGHT\tPredict\tReal");
        bw.write("\n");
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] docPairFields = line.split("\t");
            String mDoc = docPairFields[0];
            String cDoc = docPairFields[1];
            String pCls = "";
            String rCls = docPairFields[2];
            JsonNode mNode = objectMapper.readTree(docPairFields[4]);
            JsonNode cNode = objectMapper.readTree(docPairFields[5]);
            EventFeature feature = new EventFeature(mNode, cNode, rCls);
            Instances instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
            instances.setClassIndex(instances.numAttributes() - 1);
            instances.add(feature.toInstanceV2());
            double[] distribute = forest.distributionsForInstances(instances)[0];
            double difScr = distribute[0];
            double evtScr = distribute[1];
            if (evtScr > 0.98765) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.98765) {//EVENT
                if (!StringUtils.equals(rCls, "DUP")) {
                    ppEVT++;
                }
                pCls = "EVENT";
                if (StringUtils.equals(rCls, "EVENT")) {
                    tpEVT++;
                }
            } else {
                pCls = "DIFF";
            }
            
            if (StringUtils.equals(rCls, "EVENT")) {
                rpEVT++;
            }
            if (StringUtils.equals(rCls, "DUP")) {
                rpDUP++;
            }
            
            if (!StringUtils.equals(rCls, pCls)) {
                bw.write(mDoc + "\t" + cDoc + "\t" + String.valueOf(difScr) + "\t" + String.valueOf(evtScr) + "\t" + pCls + "\t" + rCls);
                bw.write("\n");
            }
        }
        
        bw.close();
        
        double tprDUP = tpDUP / Double.valueOf(ppDUP);
        double rcrDUP = tpDUP / Double.valueOf(rpDUP);
        System.out.println("## TPR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(ppDUP) + "=" + String.valueOf(tprDUP));
        System.out.println("## RCR DUP    : " + String.valueOf(tpDUP) + "/" + String.valueOf(rpDUP) + "=" + String.valueOf(rcrDUP));
        
        double tprEVT = tpEVT / Double.valueOf(ppEVT);
        double rcrEVT = tpEVT / Double.valueOf(rpEVT);
        System.out.println("## TPR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(ppEVT) + "=" + String.valueOf(tprEVT));
        System.out.println("## RCR EVT    : " + String.valueOf(tpEVT) + "/" + String.valueOf(rpEVT) + "=" + String.valueOf(rcrEVT));
    }
    
    
    /**
     *
     */
    public static List<double[]> predictOnline(RandomForest forest, JsonNode masterNode, JsonNode canditNodes) throws Exception {
        
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributesV1();
        Instances instances;
        
        // 2. create Instances object
        instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
        instances.setClassIndex(instances.numAttributes() - 1);
        for (JsonNode canditNode : canditNodes) {
            EventFeature feature = new EventFeature(masterNode, canditNode, null);
            System.out.println(mapper.writeValueAsString(feature));
            instances.add(feature.toInstanceV1());
        }
        
        // 3.
        List<double[]> result = new ArrayList<>();
        double[][] canditResults = forest.distributionsForInstances(instances);
        for (int j = 0; j < canditResults.length; j++) {
            result.add(canditResults[j]);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201117/";

        /** Model Training */
        String trainARFFPath = Paths.get(rootDir, "train.arff").toString();
        String testARFFPath = Paths.get(rootDir, "train.arff").toString();
        trainModel(trainARFFPath, testARFFPath);

        /** Model Inference ONLINE */
//        ObjectMapper mapper = new ObjectMapper();
//        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/_local/train/20201117/forest.model");
//        String masterStr = "{\"_id\": \"0XOFelNi\", \"c_word\": 799, \"channels\": [\"Election\", \"County^^Clerk\"], \"channels_v2\": [\"Municipal\", \"Ballot\", \"Sanpete^^County\", \"Voting\", \"Utah\"], \"epoch\": {\"$numberLong\": \"1603339200\"}, \"geotag\": [{\"name\": \"sanpete county\", \"score\": 0.9877170920372009, \"coord\": \"39.309008,-111.570679\", \"pid\": \"sanpete_county,utah\", \"type\": \"county\"}], \"geotag_v2\": [{\"name\": \"sanpete county\", \"score\": 0.9877170920372009, \"coord\": \"39.309008,-111.570679\", \"pid\": \"sanpete_county,utah\", \"type\": \"county\"}], \"highlightkeyword_list\": [[\"Sanpete^^County\", 0.9978683052559266], [\"Justin^^Lee\", 0.03661704829883073], [\"Sandy^^Neill\", 0.0037676097400794312], [\"Jason^^Springer\", 0.0020129119572031492], [\"IVS\", 3.7798490911735127E-6], [\"Ephraim\", 9.516623390226471E-7], [\"Facebook\", 8.558741948382512E-7], [\"Utah\", 8.231094179432592E-7]], \"insert_time\": \"2020-10-23 03:02:11\", \"kw_title\": [\"IVS-printed^^ballots\", \"Numerous^^instructions\"], \"kws\": [\"IVS-printed^^ballots\", \"Voting\", \"voting^^requirements\", \"Numerous^^instructions\", \"voters\", \"election\", \"state^^election^^officials\", \"county^^clerk\", \"mailboxes\", \"Postcards\", \"Integrated^^Voting^^Systems\", \"Utah^^election^^director\", \"Sanpete^^County^^residents\", \"Facebook\", \"Person^^Sanpete\", \"law\", \"flap\", \"signing\", \"line\", \"video\"], \"ne_content_location\": {\"Sanpete\": 1, \"Calif.\": 1, \"Sanpete County\": 6, \"Utah\": 1, \"Dinuba\": 1}, \"ne_content_organization\": {\"Sanpete County Clerk 's Office\": 1, \"Integrated Voting Systems\": 1, \"Facebook\": 2}, \"ne_content_person\": {\"Springer\": 1, \"Neill\": 4, \"Sandy Neill\": 1, \"Justin Lee\": 2, \"Jason Springer\": 1, \"Ephraim\": 1, \"Lee\": 3}, \"paragraph_count\": 18.0, \"simhash\": \"aeedbbd5a64f12a3c0b48d1f2ae74f8f\", \"spacy_content_loc\": [\"Sanpete County\", \"Sanpete County\", \"Utah\", \"Dinuba\", \"Calif.\", \"Sanpete County\", \"Sanpete\", \"Sanpete County\", \"Sanpete County\"], \"spacy_content_num\": [\"10\", \"Approximately 13,000\"], \"spacy_content_org\": [\"Integrated Voting Systems\", \"Sanpete County\", \"Ephraim\", \"Facebook\", \"the Sanpete County Clerk 's\", \"IVS\", \"Sanpete\", \"IVS\", \"IVS\", \"IVS\", \"IVS\"], \"spacy_content_per\": [\"Justin Lee\", \"Sandy Neill\", \"Sanpete Messenger 's\", \"Jason Springer\", \"Springer\", \"Justin Lee\", \"Lee\", \"Lee\", \"Lee\", \"Messenger\", \"Neill\", \"Neill\", \"Sanpete County\", \"Neill\", \"Neill\"], \"spacy_content_tim\": [\"Friday , Oct. 30\", \"Nov. 3\", \"earlier this year\", \"June\"], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [], \"spacy_title_per\": [], \"spacy_title_tim\": [], \"src\": \"San Pete Messenger\", \"stitle\": \"Ballots will count ; Just follow instructions to sign\", \"text_category\": {\"first_cat\": {\"PoliticsGovernment\": 0.8701164332789365}, \"second_cat\": {\"PoliticsGovernment_Elections\": 0.7464191551307453}, \"third_cat\": {\"PoliticsGovernment_Elections_Other\": 0.7464191551307453}}, \"text_category_v2\": {\"first_cat\": {\"PoliticsGovernment\": 0.8701164332789365}, \"second_cat\": {\"PoliticsGovernment_Elections\": 0.7464191551307453}, \"third_cat\": {\"PoliticsGovernment_Elections_Other\": 0.7464191551307453}}, \"url\": \"http://sanpetemessenger.com/archives/19996\"}";
//        String canditStr =
//            "[" +
//            "{\"_id\": \"0XJClwWa\", \"c_word\": 411, \"channels\": [], \"channels_v2\": [\"Federal\", \"Ballot\", \"Voting\"], \"epoch\": {\"$numberLong\": \"1602711660\"}, \"geotag\": [{\"name\": \"sanpete county\", \"score\": 0.9649950265884399, \"coord\": \"39.309008,-111.570679\", \"pid\": \"sanpete_county,utah\", \"type\": \"county\"}], \"geotag_v2\": [{\"name\": \"sanpete county\", \"score\": 0.9649950265884399, \"coord\": \"39.309008,-111.570679\", \"pid\": \"sanpete_county,utah\", \"type\": \"county\"}], \"highlightkeyword_list\": [[\"Sanpete^^County\", 0.5426166260869868], [\"Sanpete^^ballots\", 0.09736059713829608], [\"Sanpete^^county\", 0.08002249438465651], [\"Sandy^^Neill\", 0.015598507382553072], [\"Utah\", 1.5352493350901145E-5], [\"MANTI\", 7.733843714325375E-6], [\"worry\", 8.158732285331759E-7]], \"insert_time\": \"2020-10-14 21:46:10\", \"kw_title\": [\"Sanpete^^ballots\", \"Sanpete^^County\"], \"kws\": [\"Sanpete^^ballots\", \"Sanpete^^County\", \"voters\", \"county^^employees\", \"MANTI\", \"ABC4^^Utah\", \"detailed^^instructions\", \"line\", \"signature^^gathering\", \"transmission^^rates\", \"ABC4^^News\", \"face\", \"Sandy^^Neill\", \"volunteers\"], \"ne_content_location\": {\"Sanpete county\": 1, \"MANTI\": 1, \"Sanpete County\": 2, \"Utah\": 4}, \"ne_content_organization\": {\"Sanpete County Clerks Office\": 1}, \"ne_content_person\": {\"Sandy Neill\": 1, \"Neil\": 1}, \"paragraph_count\": 10.0, \"simhash\": \"aefd89d5e64a3ae168b6443d09e2c6c6\", \"spacy_content_loc\": [\"Utah\", \"Utah\", \"Sanpete County\", \"Sanpete county\", \"the State of Utah\", \"The State of Utah\"], \"spacy_content_num\": [\"Thousands\", \"First\", \"435\"], \"spacy_content_org\": [\"MANTI\", \"ABC4 News\", \"Sanpete County\", \"the Sanpete County Clerks Office\"], \"spacy_content_per\": [\"Sandy Neill\", \"Neil\"], \"spacy_content_tim\": [], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [\"Sanpete\"], \"spacy_title_per\": [], \"spacy_title_tim\": [], \"src\": \"ABC 4\", \"stitle\": \"Signature error on Sanpete ballots causes voter concern , but do n't worry the fix is in\", \"text_category\": {\"first_cat\": {\"PoliticsGovernment\": 0.8678179665513679}, \"second_cat\": {\"PoliticsGovernment_Elections\": 0.7352869287944179}, \"third_cat\": {\"PoliticsGovernment_Elections_Other\": 0.7352869287944179}}, \"text_category_v2\": {\"first_cat\": {\"PoliticsGovernment\": 0.8678179665513679}, \"second_cat\": {\"PoliticsGovernment_Elections\": 0.7352869287944179}, \"third_cat\": {\"PoliticsGovernment_Elections_Other\": 0.7352869287944179}}, \"url\": \"https://www.abc4.com/news/local-news/signature-error-on-sanpete-ballots-causes-voter-concern-but-dont-worry-the-fix-is-in/\"}" +
//            "]";
//        List<double[]> indexList = predictOnline(forest, mapper.readTree(masterStr), mapper.readTree(canditStr));
//        for (double[] weight : indexList) {
//            System.out.println(String.valueOf(weight[0]) + "\t" + String.valueOf(weight[1]));
//        }
        
        /** Model Inference STD Estimate */
        String onlineModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201014/forest.model";
        String abtestModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201117/forest.model";
        RandomForest onlineForest = (RandomForest) SerializationHelper.read(onlineModelPath);
        RandomForest abtestForest = (RandomForest) SerializationHelper.read(abtestModelPath);
        
        String estimateDataPath = "/Users/yuxi/NB/RandomForest/_local/estimate/estimate_doc_pair_fields";
        String trainDataPath = "/Users/yuxi/NB/RandomForest/_local/train/20201117/train_fields";
        
        predictEstimateDataFeatureV1(abtestForest, estimateDataPath);
        System.out.println("==========================");
        
        predictEstimateDataFeatureV1(abtestForest, trainDataPath);
        System.out.println("==========================");
        
        String testPath = "/Users/yuxi/NB/RandomForest/_local/estimate/20201023/label_result_fields";
//        predictEstimateDataFeatureV0(onlineForest, testPath);
        predictEstimateDataFeatureV1(abtestForest, testPath);
    }
}
