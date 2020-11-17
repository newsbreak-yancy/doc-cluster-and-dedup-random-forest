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
            if (evtScr > 0.95) {
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
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201117/";

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
        String abtestModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201117/forest.model";
        RandomForest onlineForest = (RandomForest) SerializationHelper.read(onlineModelPath);
        RandomForest abtestForest = (RandomForest) SerializationHelper.read(abtestModelPath);
        
        String estimateDataPath = "/Users/yuxi/NB/RandomForest/_local/estimate/estimate_doc_pair_fields";
        String trainDataPath = "/Users/yuxi/NB/RandomForest/_local/train/20201117/train_fields";
        
//        predictEstimateDataFeatureV1(abtestForest, estimateDataPath);
//        System.out.println("==========================");
//        predictEstimateDataFeatureV1(abtestForest, trainDataPath);
        
        String testPath = "/Users/yuxi/NB/RandomForest/_local/append_0926~0930/dp_0926_0930_tech_fields";
        predictEstimateDataFeatureV1(abtestForest, testPath);
    }
}