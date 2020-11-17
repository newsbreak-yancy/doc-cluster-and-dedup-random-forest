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
        forest.setNumIterations(200);
        forest.setDebug(false);
        forest.setNumFeatures(4); // random feature num = log_2{feature num}
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
//        ArrayList<String> attVals = new ArrayList<>();
//        // - numeric
//        attributes.add(new Attribute("TitleDist"));
//        attributes.add(new Attribute("TitleRatio"));
//        attributes.add(new Attribute("TitleLength"));
//        attributes.add(new Attribute("SameSRC"));
//        attributes.add(new Attribute("CWordSpan"));
//        attributes.add(new Attribute("ParagraphSpan"));
//        attributes.add(new Attribute("EpochSpan"));
//        attributes.add(new Attribute("InsertSpan"));
//        attributes.add(new Attribute("SimhashDist"));
//        attributes.add(new Attribute("CKWSRatio"));
//        attributes.add(new Attribute("CKWSLength"));
//        attributes.add(new Attribute("TKWSRatio"));
//        attributes.add(new Attribute("TKWSLength"));
//        attributes.add(new Attribute("HKWSRatio"));
//        attributes.add(new Attribute("HKWSLength"));
//        attributes.add(new Attribute("ChannelRatio"));
//        attributes.add(new Attribute("ChannelLength"));
//        attributes.add(new Attribute("COrgRatioNE"));
//        attributes.add(new Attribute("COrgRatioSP"));
//        attributes.add(new Attribute("COrgLengthNE"));
//        attributes.add(new Attribute("COrgLengthSP"));
//        attributes.add(new Attribute("CLocRatioNE"));
//        attributes.add(new Attribute("CLocRatioSP"));
//        attributes.add(new Attribute("CLocLengthNE"));
//        attributes.add(new Attribute("CLocLengthSP"));
//        attributes.add(new Attribute("CPerRatioNE"));
//        attributes.add(new Attribute("CPerRatioSP"));
//        attributes.add(new Attribute("CPerLengthNE"));
//        attributes.add(new Attribute("CPerLengthSP"));
//        attributes.add(new Attribute("CNUMRatioSP"));
//        attributes.add(new Attribute("CNUMLengthSP"));
//        attributes.add(new Attribute("CTimRatioSP"));
//        attributes.add(new Attribute("CTimLengthSP"));
//        attributes.add(new Attribute("TOrgRatioNE"));
//        attributes.add(new Attribute("TOrgRatioSP"));
//        attributes.add(new Attribute("TOrgLengthNE"));
//        attributes.add(new Attribute("TOrgLengthSP"));
//        attributes.add(new Attribute("TLocRatioNE"));
//        attributes.add(new Attribute("TLocRatioSP"));
//        attributes.add(new Attribute("TLocLengthNE"));
//        attributes.add(new Attribute("TLocLengthSP"));
//        attributes.add(new Attribute("TPerRatioNE"));
//        attributes.add(new Attribute("TPerRatioSP"));
//        attributes.add(new Attribute("TPerLengthNE"));
//        attributes.add(new Attribute("TPerLengthSP"));
//        attributes.add(new Attribute("TNUMRatioSP"));
//        attributes.add(new Attribute("TNUMLengthSP"));
//        attributes.add(new Attribute("TTimRatioSP"));
//        attributes.add(new Attribute("TTimLengthSP"));
//        attributes.add(new Attribute("CatRatio"));
//        attributes.add(new Attribute("CatLength"));
//        attributes.add(new Attribute("GEORatio"));
//        attributes.add(new Attribute("GEOLength"));
//        // - nominal
//        attVals.add("DIFF");
//        attVals.add("EVENT");
//        attributes.add(new Attribute("Label", attVals));
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
            instances.add(feature.toInstanceV1());
            double[] distribute = forest.distributionsForInstances(instances)[0];
            double difScr = distribute[0];
            double evtScr = distribute[1];
            if (evtScr > 0.92) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.55) {//EVENT
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
            if (evtScr > 0.92) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.55) {//EVENT
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
        
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributesV2();
        Instances instances;
        
        // 2. create Instances object
        instances = new Instances(UUID.randomUUID().toString(), attributes, 1);
        instances.setClassIndex(instances.numAttributes() - 1);
        for (JsonNode canditNode : canditNodes) {
            EventFeature feature = new EventFeature(masterNode, canditNode, null);
            System.out.println(mapper.writeValueAsString(feature));
            instances.add(feature.toInstanceV2());
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
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201116_v2/";

        /** Model Training */
        String trainARFFPath = Paths.get(rootDir, "train.arff").toString();
        String testARFFPath = Paths.get(rootDir, "train.arff").toString();
//        trainModel(trainARFFPath, testARFFPath);

        /** Model Inference ONLINE */
//        ObjectMapper mapper = new ObjectMapper();
//        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/_local/train/20201116_v2/forest.model");
//        String masterStr = "{\"_id\": \"0XP2Xnzo\", \"c_word\": 627, \"channels\": [\"Tim^^Burton\", \"Edward^^Scissorhands\", \"Halloween\", \"Art^^Style\"], \"channels_v2\": [\"Tim^^Burton\", \"TikTok\"], \"epoch\": {\"$numberLong\": \"1603401180\"}, \"geotag\": [], \"geotag_v2\": [], \"highlightkeyword_list\": [[\"Tim^^Burton\", 0.9715201753931492], [\"Edward^^Scissorhands\", 0.24670950332082395], [\"Ashton^^Gleckman\", 0.1669179506961412], [\"Bella^^Poarch\", 0.04290312210422955], [\"Tai^^Verdes\", 0.0066134378981913475]], \"insert_time\": \"2020-10-23 13:36:40\", \"kw_title\": [\"Tim^^Burton\", \"Tim^^Burton^^characters\", \"Tim^^Burton-style^^characters\"], \"kws\": [\"Tim^^Burton\", \"Tim^^Burton^^characters\", \"Tim^^Burton-style^^characters\", \"Edward^^Scissorhands\", \"Halloween\", \"style\", \"bizarre^^challenges\", \"Christmas\", \"♬^^Ice^^Dance\", \"bizarre\", \"gaunt^^cheeks\", \"interesting^^trends\", \"Snapchat\", \"turning\", \"popularity\", \"anime\", \"rounder\", \"line\", \"face\", \"trend\"], \"ne_content_location\": {}, \"ne_content_organization\": {\"TikTok\": 1}, \"ne_content_person\": {\"Burton\": 1, \"Edward Scissorhands\": 1, \"Tim Burton\": 4, \"Tai Verdes\": 1, \"Bella Poarch\": 1, \"Ashton Gleckman\": 2}, \"ne_title_location\": {}, \"ne_title_organization\": {}, \"ne_title_person\": {\"Tim Burton\": 1}, \"paragraph_count\": 16.0, \"simhash\": \"45a3dae78095bf0b88cbb2c58372c548\", \"spacy_content_loc\": [\"Tai Verdes\"], \"spacy_content_num\": [\"## TimeWarpScan\", \"first\", \"## fyp\", \"## TimeWarpScan\", \"## fypシ\", \"## timburtonchallenge\", \"## perfectnosechallenge\", \"## 4\", \"## asian ## timburtonchallenge\"], \"spacy_content_org\": [\"TikTok\", \"TikTok\", \"TikTok\", \"eboy\", \"TikTok\"], \"spacy_content_per\": [\"Tim Burton\", \"Bella Poarch\", \"Edward Scissorhands ''\", \"Ashton Gleckman\", \"Tim Burton\", \"Tim Burton\", \"Tim Burton\", \"Tim Burton\", \"Edward Scissorhands ''\", \"Ashton Gleckman\", \"Burton\", \"Edward Scissorhands\", \"Tim Burton\"], \"spacy_content_tim\": [\"Halloween\", \"Halloween\"], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [\"TikTok\"], \"spacy_title_per\": [\"Tim Burton\"], \"spacy_title_tim\": [], \"src\": \"dexerto.com\", \"stitle\": \"How to do the Tim Burton challenge on TikTok\", \"text_category_v2\": {\"first_cat\": {\"ArtsEntertainment\": 0.8784362503642953}, \"second_cat\": {\"ArtsEntertainment_TV\": 0.8214361582234688}, \"third_cat\": {\"ArtsEntertainment_TV_OnlineVideo\": 0.8504731989471512}}, \"url\": \"https://www.dexerto.com/entertainment/how-to-do-the-tim-burton-challenge-on-tiktok-1437610/\", \"text_category\": {\"first_cat\": {\"ArtsEntertainment\": 0.8784362503642953}, \"second_cat\": {\"ArtsEntertainment_TV\": 0.8214361582234688}, \"third_cat\": {\"ArtsEntertainment_TV_OnlineVideo\": 0.8504731989471512}}}";
//        String canditStr =
//            "[" +
//            "{\"_id\": \"0XMUE9z0\", \"c_word\": 440, \"channels\": [\"Tim^^Burton\", \"Time^^Warp\", \"Fun^^Time\"], \"channels_v2\": [\"TikTok\", \"Tim^^Burton\", \"Filter\"], \"epoch\": {\"$numberLong\": \"1603150176\"}, \"geotag\": [], \"geotag_v2\": [], \"highlightkeyword_list\": [[\"Tim^^Burton\", 0.963821822159217]], \"insert_time\": \"2020-10-19 23:35:31\", \"kw_title\": [\"Tim^^Burton\", \"warp^^scan^^filter\"], \"kws\": [\"Tim^^Burton\", \"warp^^scan^^filter\", \"unique^^filters\", \"time^^warp\", \"eyes\", \"fun\", \"sunken^^cheeks\", \"droopy^^eyes\", \"direction\", \"cooking\", \"dancing\", \"face\", \"trend\"], \"ne_content_location\": {}, \"ne_content_organization\": {}, \"ne_content_person\": {\"Tim Burton\": 6}, \"ne_title_location\": {}, \"ne_title_organization\": {}, \"ne_title_person\": {}, \"paragraph_count\": 10.0, \"simhash\": \"f7cadfe6a999b0b30ef99aad0256db58\", \"spacy_content_loc\": [], \"spacy_content_num\": [\"millions\"], \"spacy_content_org\": [\"TikTok\", \"TikTok\", \"TikTok\", \"TikTok\", \"TikTok\", \"un\"], \"spacy_content_per\": [\"Tim Burton\", \"gaga\", \"Tim Burton\", \"Tim Burton\", \"Tim Burton\", \"Tim Burton\", \"Tim Burton\"], \"spacy_content_tim\": [\"the years\"], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [\"TikTok\"], \"spacy_title_per\": [\"Tom Burton\"], \"spacy_title_tim\": [], \"src\": \"Nickel Savers \", \"stitle\": \"You Can Now Turn Yourself Into a Tom Burton Character With a TikTok Filter\", \"text_category\": {\"first_cat\": {\"ArtsEntertainment\": 0.8146928685884913, \"TechnologyElectronics\": 0.5513523128651256}, \"second_cat\": {\"ArtsEntertainment_TV\": 0.6976869687865721, \"TechnologyElectronics_Other\": 0.5513523128651256}, \"third_cat\": {\"ArtsEntertainment_TV_OnlineVideo\": 0.7909175537940507}}, \"text_category_v2\": {\"first_cat\": {\"ArtsEntertainment\": 0.8146928685884913, \"TechnologyElectronics\": 0.5513523128651256}, \"second_cat\": {\"ArtsEntertainment_TV\": 0.6976869687865721, \"TechnologyElectronics_Other\": 0.5513523128651256}, \"third_cat\": {\"ArtsEntertainment_TV_OnlineVideo\": 0.7909175537940507}}, \"url\": \"https://nickelsavers.com/you-can-now-turn-yourself-into-a-tom-burton-character-with-a-tiktok-filter/\"}" +
//            "]";
//        List<double[]> indexList = predictOnline(forest, mapper.readTree(masterStr), mapper.readTree(canditStr));
//        for (double[] weight : indexList) {
//            System.out.println(String.valueOf(weight[0]) + "\t" + String.valueOf(weight[1]));
//        }
        
        /** Model Inference STD Estimate */
        String onlineModelPath = "/Users/yuxi/NB/RandomForest/src/main/resources/model/forest.model";
        String abtestModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201116_v2/forest.model";
        RandomForest onlineForest = (RandomForest) SerializationHelper.read(onlineModelPath);
        RandomForest abtestForest = (RandomForest) SerializationHelper.read(abtestModelPath);
        
        String estimateDataPath = "/Users/yuxi/NB/RandomForest/_local/estimate/estimate_doc_pair_fields";
        String trainDataPath = "/Users/yuxi/NB/RandomForest/_local/train/20201116/train_fields";
        String tmpPath = "/Users/yuxi/NB/RandomForest/_local/append_1105~1107/label_pair_tmp_fields";
        
    
//        predictEstimateDataFeatureV0(onlineForest, estimateDataPath);
        predictEstimateDataFeatureV2(abtestForest, estimateDataPath);
    }
}

//{"_id": "0X6BFox7", "c_word": 937, "channels": ["Matter^^Protesters", "City^^Police", "State^^Police", "Jail", "Corrections^^Officer"], "channels_v2": ["LMPD", "Curfew", "Unlawful^^Assembly", "Police", "Protest", "Downtown^^Louisville"], "epoch": {"$numberLong": "1600991880"}, "geotag": [{"name": "louisville", "score": 0.9807114005088806, "coord": "38.252665,-85.758456", "pid": "louisville,kentucky", "type": "city"}], "geotag_v2": [{"name": "louisville", "score": 0.9874213933944702, "coord": "38.252665,-85.758456", "pid": "louisville,kentucky", "type": "city"}], "highlightkeyword_list": [["Jefferson^^Street", 0.01467672015545874], ["Kentucky^^AG", 0.007182585433643762], ["Aubrey^^Gregory", 0.0019834964783965307], ["Robinson^^Desroches", 0.001572360319366017], ["Jonathon^^Gregg", 3.7085317936553136E-4], ["David^^Guildford", 3.1205004330854346E-4], ["Ben^^Crump", 2.893901100856166E-4], ["Louisville", 1.771351866775454E-5], ["LOUISVILLE", 7.028410110858827E-6], ["Facebook", 1.1866025997286383E-6], ["LMPD", 1.1789877427724158E-6], ["TNT", 9.374604361721257E-7], ["Oregon", 8.564928481820795E-7], ["Indiana", 8.564928481820795E-7], ["NPR", 8.035444381637234E-7], ["NBA", 7.240710784127202E-7]], "insert_time": "2020-09-25 09:05:43", "kw_title": ["@washingtoncj^^reports^^protesters", "Police", "Louisville^^Metro^^Police"], "kws": ["@washingtoncj^^reports^^protesters", "Police", "demonstrators", "Louisville^^Metro^^Police", "arrests", "Curfew", "Officer", "nationwide^^protests", "downtown^^Louisville", "jail", "Jefferson^^Street", "Jefferson^^Square^^Park", "people", "LMPD", "home", "LOUISVILLE", "Square", "@guildford56^^reports", "4th^^Street", "Ky."], "ne_content_location": {"Oregon": 1, "LOUISVILLE": 1, "Ky.": 1, "Jefferson Street": 2, "Indiana": 1, "Kentucky": 8, "Louisville": 6, "Broadway": 1, "Fourth St.": 1, "Jefferson Square Park": 4, "Louisville Public Library": 1}, "ne_content_organization": {"NPR": 1, "Louisville Metro Corrections": 1, "Kentucky AG": 1, "Unlawful Assembly": 1, "LMPD": 1, "Louisville Metro Police": 2, "TNT": 1, "NBA": 1, "Facebook": 1}, "ne_content_person": {"Breonna Taylor": 3, "Anthony Piagentini": 1, "Jonathon Gregg": 1, "Aubrey Gregory": 1, "David Guildford": 1, "Taylor": 1, "Greg Fischer": 1, "Chelsea Washington": 1, "Gregory": 1, "Robinson Desroches": 1, "Eileen Street": 1, "Larynzo Johnson": 1, "Ben Crump": 1}, "paragraph_count": 61.0, "simhash": "9d181254ab10542ae2e9648eee16764c", "spacy_content_loc": ["LOUISVILLE", "Ky.", "Louisville", "Jefferson Square Park", "Louisville", "Louisville", "Louisville", "Indiana", "Oregon", "Broadway", "Kentucky", "Louisville", "4th Street", "Louisville", "Kentucky", "Kentucky", "Jefferson Street", "Kentucky", "Jefferson Street", "Kentucky", "Louisville", "Jefferson Square Park", "Kentucky", "Jefferson Square Park", "Kentucky", "Louisville", "Jefferson Square Park", "Kentucky"], "spacy_content_num": ["127", "71", "56", "four", "two", "809", "hundreds"], "spacy_content_org": ["Louisville Metro Police", "LMPD", "NBA", "TNT", "Spectrum News", "LMPD", "the Louisville Public Library", "the Kentucky AG 's", "LMPD", "@washingtoncj", "Spectrum News", "NPR", "@NPR", "@washingtoncj", "Spectrum News", "@eileenstreet", "@washingtoncj", "Spectrum News", "@johnnygregg", "Spectrum News", "@guildford56", "pic.twitter.com/mAu2hdEWpk", "Spectrum News", "Louisville Metro Corrections", "@washingtoncj", "Spectrum News", "@johnnygregg", "Spectrum News"], "spacy_content_per": ["Aubrey Gregory", "Robinson Desroches", "Larynzo Johnson", "Taylor", "Breonna Taylor", "Bre", "pic.twitter.com/iW9K7VYJke", "Ben Crump", "LMPD", "Breonna Taylor", "pic.twitter.com/5fuCIxGSHo", "pic.twitter.com/6uhgjqzChs", "Jonathon Gregg", "David Guildford", "Breonna Taylor", "pic.twitter.com/gLXg508C9p"], "spacy_content_tim": ["Thursday", "night", "9 p.m.", "early Thursday evening", "May", "Wednesday", "Wednesday", "Thursday", "morning", "the day", "Wednesday", "morning", "Wednesday evening", "11:43 pm", "September 25 , 2020", "10:57 pm", "September 25 , 2020", "9:03 pm", "8:53 pm Breonna Taylor 's family", "September 25 , 2020", "September 25 , 2020", "tomorrow", "the weekend", "September 25 , 2020", "8:23 pm", "September 25 , 2020 8:09 pm", "9pm", "September 25 , 2020", "September 25 , 2020", "7:53 pm", "September 24 , 2020", "7:30 pm", "September 24 , 2020", "6:57 pm", "September 24 , 2020", "6:34 pm", "September 24 , 2020", "6:25 pm", "September 24 , 2020", "September 24 , 2020", "6:21 pm", "tonight", "tomorrow", "September 24 , 2020", "6:16 pm", "September 24 , 2020"], "spacy_title_loc": [], "spacy_title_num": [], "spacy_title_org": [], "spacy_title_per": [], "spacy_title_tim": [], "src": "spectrumnews1.com", "stitle": "Police and Protesters Work Together and Both Leave the Area", "text_category": {"first_cat": {"CrimePublicsafety": 0.744892049123898, "Society": 0.6930648275513043}, "second_cat": {"CrimePublicsafety_LawEnforcement": 0.6867310102461621, "Society_Advocacy": 0.6786114893753933}, "third_cat": {"CrimePublicsafety_LawEnforcement_Other": 0.6867310102461621, "Society_Advocacy_ProtestRiot": 0.6709336016804414}}, "text_category_v2": {"first_cat": {"CrimePublicsafety": 0.744892049123898, "Society": 0.6930648275513043}, "second_cat": {"CrimePublicsafety_LawEnforcement": 0.6867310102461621, "Society_Advocacy": 0.6786114893753933}, "third_cat": {"CrimePublicsafety_LawEnforcement_Other": 0.6867310102461621, "Society_Advocacy_ProtestRiot": 0.6709336016804414}}, "url": "https://spectrumnews1.com/ky/lexington/news/2020/09/24/breonna-taylor-blog-day-2-after-decision", "ne_title_location": {}, "ne_title_organization": {"LMPD Declares Unlawful Assembly": 1}, "ne_title_person": {}}
//{"_id": "0X5bEWyF", "c_word": 912, "channels": ["Police^^Violence", "City^^Police", "Arrested^^at^^Protest", "Chicago^^Police", "Shooting"], "channels_v2": ["Breonna^^Taylor^^'s", "Arrested^^at^^Protest", "Police", "Officer"], "epoch": {"$numberLong": "1600928100"}, "geotag": [{"name": "louisville", "score": 0.8117508292198181, "coord": "38.252665,-85.758456", "pid": "louisville,kentucky", "type": "city"}], "geotag_v2": [{"name": "louisville", "score": 0.8117508292198181, "coord": "38.252665,-85.758456", "pid": "louisville,kentucky", "type": "city"}], "highlightkeyword_list": [["Breonna^^Taylor", 0.9988386193140475], ["Michigan^^Avenue", 0.001361580194399512], ["Carmen^^Jones", 0.0013005507055718262], ["Brett^^Hankison", 8.721735131422076E-4], ["Daniel^^Cameron", 7.964248237270038E-4], ["Robert^^Schroeder", 7.313298688819096E-4], ["Ben^^Crump", 5.648301402179838E-4], ["LOUISVILLE", 7.002816491674354E-6], ["Kentucky", 6.092390272389087E-6], ["Washington", 1.1376332919361356E-6], ["Louisville", 1.043989333553666E-6], ["Philadelphia", 9.397253129607896E-7], ["Atlanta", 8.741713754169883E-7], ["Charlotte", 8.522145508786331E-7], ["Minneapolis", 8.262238124904956E-7], ["FBI", 8.213842046482011E-7], ["Chicago", 7.759299594636976E-7], ["unrest", 4.927841420188377E-7]], "insert_time": "2020-09-24 11:58:19", "kw_title": ["Miss^^Breonna^^Taylor", "Kentucky^^police^^officers", "white^^officers", "Louisville", "downtown^^Louisville", "Officer", "unrest"], "kws": ["Miss^^Breonna^^Taylor", "Kentucky^^police^^officers", "police", "white^^officers", "shooting", "protesters", "Louisville", "Violence", "downtown^^Louisville", "Officer", "demonstrators", "unrest", "protest^^signs", "streets", "Authorities", "Ky.", "Miss^^Taylor", "criminal^^charges", "FBI", "Kentucky^^law"], "ne_content_location": {"North Carolina": 1, "LOUISVILLE": 1, "Ky.": 1, "New York": 1, "Charlotte": 1, "Chicago": 1, "Kentucky": 3, "Louisville": 3, "D.C.": 1, "Washington": 1, "Millennium Park": 1, "U.S.": 1, "Minneapolis": 1, "Michigan Avenue": 1, "Atlanta": 1, "America": 2, "Philadelphia": 1, "Las Vegas": 1}, "ne_content_organization": {"FBI": 1, "Interim Police": 1, "AP": 1}, "ne_content_person": {"Breonna Taylor": 2, "Robert Schroeder": 1, "Malcolm": 1, "Brett Hankison": 1, "Myles -RRB- Cosgrove": 1, "Taylor": 11, "Martin": 1, "Cameron": 2, "Jones": 1, "George Floyd": 1, "Kenneth Walker": 1, "Carmen Jones": 1, "Jonathan -RRB- Mattingly": 1, "Daniel Cameron": 1, "Ben Crump": 1, "Morgan Julianna Lee": 1}, "ne_title_location": {"Louisville": 1, "US": 1}, "ne_title_organization": {}, "ne_title_person": {"Breonna Taylor": 1}, "paragraph_count": 21.0, "simhash": "5211522e079ec02b22700d2f8a36fd58", "spacy_content_loc": ["LOUISVILLE", "Ky.", "Kentucky", "America", "Louisville", "New York", "Washington", "D.C.", "Philadelphia", "Las Vegas", "Chicago", "Millennium Park", "Michigan Avenue", "Atlanta", "Louisville", "Louisville", "U.S.", "America", "Minneapolis", "Kentucky", "Charlotte", "North Carolina", "Kentucky"], "spacy_content_num": ["two", "three", "Hundreds", "two"], "spacy_content_org": ["AP", "Americans", "Republican", "first Black", "SWAT", "Black Americans", "FBI"], "spacy_content_per": ["Breonna Taylor 's", "Taylor", "Daniel Cameron", "Brett Hankison", "Taylor", "Taylor", "Robert Schroeder", "Taylor", "Carmen Jones", "Martin", "Malcolm", "Jones", "Taylor", "George Floyd", "Taylor", "Taylor", "Taylor", "Ben Crump", "Taylor", "Morgan Julianna Lee", "Cameron", "Taylor", "Cameron", "Taylor", "Kenneth Walker", "Breonna Taylor 's"], "spacy_content_tim": ["March", "Wednesday", "Wednesday night", "every day", "nearly three months", "the entire summer", "May", "March 13"], "spacy_title_loc": ["Louisville", "US"], "spacy_title_num": ["2"], "spacy_title_org": [], "spacy_title_per": ["Breonna Taylor"], "spacy_title_tim": [], "src": "tucson.com", "stitle": "2 officers shot in Louisville as unrest over Breonna Taylor decision sweeps US", "text_category": {"first_cat": {"CrimePublicsafety": 0.7456076331366173, "Society": 0.6567081654206074}, "second_cat": {"CrimePublicsafety_LawEnforcement": 0.5820220447378559, "CrimePublicsafety_ViolentCrime": 0.6215998859361835, "Society_Minorities": 0.5646018566134551}, "third_cat": {"Society_Minorities_Other": 0.5646018566134551, "CrimePublicsafety_ViolentCrime_Other": 0.6215998859361835, "CrimePublicsafety_LawEnforcement_Other": 0.5820220447378559}}, "text_category_v2": {"first_cat": {"CrimePublicsafety": 0.7456076331366173, "Society": 0.6567081654206074}, "second_cat": {"CrimePublicsafety_LawEnforcement": 0.5820220447378559, "CrimePublicsafety_ViolentCrime": 0.6215998859361835, "Society_Minorities": 0.5646018566134551}, "third_cat": {"Society_Minorities_Other": 0.5646018566134551, "CrimePublicsafety_ViolentCrime_Other": 0.6215998859361835, "CrimePublicsafety_LawEnforcement_Other": 0.5820220447378559}}, "url": "https://tucson.com/news/2-officers-shot-in-louisville-as-unrest-over-breonna-taylor-decision-sweeps-us/article_4318e3ae-575a-5ee6-b8c4-565ff2e30894.html"}