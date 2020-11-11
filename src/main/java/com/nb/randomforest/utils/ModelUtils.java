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
//        Instances testingDataSet = getDataSet(testFile);
//        testingDataSet.setClassIndex(trainingDataSet.numAttributes() - 1);

        RandomForest forest = new RandomForest();
        forest.setNumIterations(200);
        forest.setDebug(false);
        forest.setNumFeatures(4); // random feature num = log_2{feature num}
        forest.setComputeAttributeImportance(true);
        forest.buildClassifier(trainingDataSet);
    
//        Evaluation eval = new Evaluation(trainingDataSet);
//        eval.evaluateModel(forest, testingDataSet);
    
        

//        /** Print the algorithm summary */
//        System.out.println("** Decision Tress Evaluation with Datasets **");
//        System.out.println(eval.toSummaryString());
//        System.out.print(" the expression for the input data as per alogorithm is ");
//        System.out.println(forest);
        
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
     *
     */
    public static void predictABTestBasedARFF2Class(RandomForest forest, String docPairFile) throws Exception {
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
            instances.add(feature.toInstance());
            double[] distribute = forest.distributionsForInstances(instances)[0];
            double difScr = distribute[0];
            double evtScr = distribute[1];
            if (evtScr > 0.97) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.58d) {//EVENT
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
        for (JsonNode canditNode : canditNodes) {
            EventFeature feature = new EventFeature(masterNode, canditNode, null);
            System.out.println(mapper.writeValueAsString(feature));
            instances.add(feature.toInstance());
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
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201109/";

        /** Model Training */
//        String trainARFFPath = Paths.get(rootDir, "mixture_fields_1_1_4_shuf.arff").toString();
//        String testARFFPath = Paths.get(rootDir, "mixture_fields_1_1_4_shuf.arff").toString();
//        trainModel(trainARFFPath, testARFFPath);

        /** Model Inference ABTEST */
//        RandomForest forest = (RandomForest) SerializationHelper.read(Paths.get(rootDir, "forest.model").toString());
//        predictABTestBasedARFF2Class(forest, Paths.get(rootDir, "test_fields").toString());
        
        /** Model Inference ONLINE */
        ObjectMapper mapper = new ObjectMapper();
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/src/main/resources/model/forest.model");
        String masterStr = "{ \"_id\" : \"0XUvlBUD\", \"c_word\" : 350, \"channels\" : [ \"Suicide\", \"Star\", \"TMZ\" ], \"channels_v2\" : [ \"Suicide\", \"Burrell\", \"Michigan\", \"Death\" ], \"dup_id\" : \"0XUvlBUD\", \"epoch\" : 1604251404 , \"evt_id\" : \"0XUvlBUD\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-11-01 17:33:25\", \"kws\" : [ \"Nate^^Burrell\", \"Nick\", \"Star\", \"Nathan\", \"committed^^suicide\", \"Chelsey^^Walker\", \"stars\", \"TMZ\", \"guilt\", \"jail\", \"A&E\", \"Michigan\", \"downtown^^Allegan\", \"Facebook\", \"Iraq\" ], \"nbr_id\" : \"0XUvlBUD\", \"ne_content_location\" : { \"Iraq\" : 1, \"Michigan\" : 2 }, \"ne_content_organization\" : { \"A&E\" : 1, \"Facebook\" : 1, \"Marine\" : 1 }, \"ne_content_person\" : { \"Nate\" : 7, \"Chelsey Walker\" : 1, \"Nathan\" : 1, \"Nate Burrell\" : 1, \"Burrell\" : 1, \"Nick\" : 1 }, \"ne_title_location\" : {}, \"ne_title_organization\" : { \"Star Nate Burrell Dead\" : 1 }, \"ne_title_person\" : {}, \"paragraph_count\" : 9.0, \"simhash\" : \"a850f385d85520fe8a3c49895fb50ada\", \"src\" : \"foxbangor.com\", \"stitle\" : \"’60 Days In ' Star Nate Burrell Dead At 33 from Suicide By Gunshot\", \"text_category\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.914416134357452 }, \"second_cat\" : { \"ArtsEntertainment_TV\" : 0.914416134357452 }, \"third_cat\" : { \"ArtsEntertainment_TV_ShowsPrograms\" : 0.612052619457245 } }, \"text_category_v2\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.812882513157543, \"CrimePublicsafety\" : 0.518158864941996 }, \"second_cat\" : { \"ArtsEntertainment_Celebrities\" : 0.67341052247912, \"ArtsEntertainment_TV\" : 0.509846234747723, \"CrimePublicsafety_Other\" : 0.518158864941996 }, \"third_cat\" : { \"ArtsEntertainment_TV_Other\" : 0.509846234747723, \"ArtsEntertainment_Celebrities_Other\" : 0.67341052247912 } }, \"url\" : \"https://foxbangor.com/tmz/60-days-in-star-nate-burrell-dead-at-33-from-suicide-by-gunshot/\" }";
        String canditStr =
            "[" +
            "{ \"_id\" : \"0XUygKpC\", \"c_word\" : 2257, \"channels\" : [ \"Jordan\", \"Suicide^^Prevention\", \"Suicidal^^Thoughts\", \"Star\", \"Childhood^^Memories\" ], \"channels_v2\" : [ \"Suicide\", \"Suicide^^Prevention\", \"Burrell\", \"Facebook^^Live\" ], \"dup_id\" : \"0XUygKpC\", \"epoch\" : 1604260035 , \"evt_id\" : \"0XUygKpC\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-11-01 19:52:16\", \"kws\" : [ \"Nate^^Burrell\", \"Nathan^^Burrell\", \"suicide^^Saturday^^night\", \"Jordan\", \"Tamara^^MOM\", \"Suicide^^Prevention\", \"suicidal^^thoughts\", \"shot\", \"star\", \"childhood^^memories\", \"TMZ\", \"guilt\", \"God\", \"jail\", \"depression\", \"eternal^^life\", \"Facebook\", \"love^^hunting\", \"wake\", \"prisoner\" ], \"nbr_id\" : \"0XUygKpC\", \"ne_content_location\" : { \"Allegan\" : 1, \"Iraq\" : 1, \"America\" : 1, \"Michigan\" : 2 }, \"ne_content_organization\" : { \"A&E\" : 1, \"Lanphear Tool Works Inc.\" : 1, \"Allegan High School\" : 1, \"United States Marine Corps\" : 1, \"Foreman for Building Restorations Inc.\" : 1, \"Solidworks CAD\" : 1 }, \"ne_content_person\" : { \"Tamara\" : 1, \"Nathan Burrell\" : 1, \"Nate Burrell\" : 2, \"Rasmussen\" : 1, \"Jordan\" : 4, \"Burrell\" : 4 }, \"ne_title_location\" : {}, \"ne_title_organization\" : {}, \"ne_title_person\" : { \"Nate Burrell\" : 1, \"Jordan\" : 1 }, \"paragraph_count\" : 36.0, \"simhash\" : \"eaf0f24dc832a5b8c8eb57bf1b3c5e7d\", \"src\" : \"Heavy.com\", \"stitle\" : \"Nate Burrell 's Wife Jordan Mentioned in Tragic Suicide Note\", \"text_category\" : {}, \"text_category_v2\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.881583620725601 }, \"second_cat\" : { \"ArtsEntertainment_Celebrities\" : 0.868086179490401 }, \"third_cat\" : { \"ArtsEntertainment_Celebrities_Other\" : 0.868086179490401 } }, \"url\" : \"https://heavy.com/entertainment/nate-burrell-wife-jordan-suicide-note/\" }" +
            "]";
        List<double[]> indexList = predictOnline(forest, mapper.readTree(masterStr), mapper.readTree(canditStr));
        for (double[] weight : indexList) {
            System.out.println(String.valueOf(weight[0]) + "\t" + String.valueOf(weight[1]) + "\t" + String.valueOf(weight[2]));
        }
        
        /** Model Inference STD Estimate */
//        String modelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201109/forest.model";
//        String estimateDataPath = "/Users/yuxi/NB/RandomForest/_local/estimate/estimate";
//        RandomForest forest = (RandomForest) SerializationHelper.read(modelPath);
//        predictABTestBasedARFF2Class(forest, estimateDataPath);
    }
}