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
        forest.setNumFeatures(7); // random feature num = log_2{feature num}
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
    public static void predictEstimateDataFeatureV1(RandomForest forest, String docPairFile) throws Exception {
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
     * 基于 Feature V2(53) + Estimate Data => Model Estimate
     *
     */
    public static void predictEstimateDataFeatureV2(RandomForest forest, String docPairFile) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<Attribute> attributes = new ArrayList<>();
        ArrayList<String> attVals = new ArrayList<>();
        // - numeric
        attributes.add(new Attribute("TitleDist"));
        attributes.add(new Attribute("TitleRatio"));
        attributes.add(new Attribute("TitleLength"));
        attributes.add(new Attribute("SameSRC"));
        attributes.add(new Attribute("CWordSpan"));
        attributes.add(new Attribute("ParagraphSpan"));
        attributes.add(new Attribute("EpochSpan"));
        attributes.add(new Attribute("InsertSpan"));
        attributes.add(new Attribute("SimhashDist"));
        attributes.add(new Attribute("CKWSRatio"));
        attributes.add(new Attribute("CKWSLength"));
        attributes.add(new Attribute("TKWSRatio"));
        attributes.add(new Attribute("TKWSLength"));
        attributes.add(new Attribute("HKWSRatio"));
        attributes.add(new Attribute("HKWSLength"));
        attributes.add(new Attribute("ChannelRatio"));
        attributes.add(new Attribute("ChannelLength"));
        attributes.add(new Attribute("COrgRatioNE"));
        attributes.add(new Attribute("COrgRatioSP"));
        attributes.add(new Attribute("COrgLengthNE"));
        attributes.add(new Attribute("COrgLengthSP"));
        attributes.add(new Attribute("CLocRatioNE"));
        attributes.add(new Attribute("CLocRatioSP"));
        attributes.add(new Attribute("CLocLengthNE"));
        attributes.add(new Attribute("CLocLengthSP"));
        attributes.add(new Attribute("CPerRatioNE"));
        attributes.add(new Attribute("CPerRatioSP"));
        attributes.add(new Attribute("CPerLengthNE"));
        attributes.add(new Attribute("CPerLengthSP"));
        attributes.add(new Attribute("CNUMRatioSP"));
        attributes.add(new Attribute("CNUMLengthSP"));
        attributes.add(new Attribute("CTimRatioSP"));
        attributes.add(new Attribute("CTimLengthSP"));
        attributes.add(new Attribute("TOrgRatioNE"));
        attributes.add(new Attribute("TOrgRatioSP"));
        attributes.add(new Attribute("TOrgLengthNE"));
        attributes.add(new Attribute("TOrgLengthSP"));
        attributes.add(new Attribute("TLocRatioNE"));
        attributes.add(new Attribute("TLocRatioSP"));
        attributes.add(new Attribute("TLocLengthNE"));
        attributes.add(new Attribute("TLocLengthSP"));
        attributes.add(new Attribute("TPerRatioNE"));
        attributes.add(new Attribute("TPerRatioSP"));
        attributes.add(new Attribute("TPerLengthNE"));
        attributes.add(new Attribute("TPerLengthSP"));
        attributes.add(new Attribute("TNUMRatioSP"));
        attributes.add(new Attribute("TNUMLengthSP"));
        attributes.add(new Attribute("TTimRatioSP"));
        attributes.add(new Attribute("TTimLengthSP"));
        attributes.add(new Attribute("CatRatio"));
        attributes.add(new Attribute("CatLength"));
        attributes.add(new Attribute("GEORatio"));
        attributes.add(new Attribute("GEOLength"));
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
            if (evtScr > 0.8) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.5) {//EVENT
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
        
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributes();
        Instances instances;
        
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
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201116/";

        /** Model Training */
//        String trainARFFPath = Paths.get(rootDir, "train.arff").toString();
//        String testARFFPath = Paths.get(rootDir, "train.arff").toString();
//        trainModel(trainARFFPath, null);

        /** Model Inference ABTEST */
//        RandomForest forest = (RandomForest) SerializationHelper.read(Paths.get(rootDir, "forest.model").toString());
//        predictABTestBasedARFF2Class(forest, Paths.get(rootDir, "test_fields").toString());
        
        /** Model Inference ONLINE */
        ObjectMapper mapper = new ObjectMapper();
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/_local/train/20201116/forest.model");
        String masterStr = "{\"_id\": \"0XP2Wa3W\", \"c_word\": 102, \"channels\": [\"Donald^^Trump\", \"Presidential^^Debate\", \"President^^Biden\", \"White^^Hair\"], \"channels_v2\": [\"Federal\", \"Donald^^Trump\", \"Joe^^Biden\", \"Mike^^Pence\", \"Presidential^^Debate\", \"Nikhila^^Natarajan^^Washington\"], \"epoch\": {\"$numberLong\": \"1603422024\"}, \"geotag\": [], \"geotag_v2\": [], \"highlightkeyword_list\": [[\"Mike^^Pence\", 0.9879817985691198], [\"Kamala^^Harris\", 0.986445297630299], [\"Natarajan\", 1.843513281266286E-5], [\"debate\", 7.064296135209436E-6], [\"Nashville\", 6.173556601522477E-6], [\"Tennessee\", 4.932300812661011E-6], [\"Biden\", 1.1122505337677468E-6]], \"insert_time\": \"2020-10-23 03:01:21\", \"kw_title\": [\"Trump\", \"presidential^^debate\", \"presidential^^debate^^history\", \"Biden\"], \"kws\": [\"Trump\", \"presidential^^debate\", \"presidential^^debate^^history\", \"Biden\", \"white^^hair\", \"Mike^^Pence^^debate\", \"Mike^^Pence\", \"Nashville\", \"Washington\", \"Nikhila^^Natarajan^^Washington\"], \"ne_content_location\": {\"Tennessee\": 1, \"Nashville\": 1, \"US\": 3}, \"ne_content_organization\": {}, \"ne_content_person\": {\"Nikhila Natarajan Washington\": 1, \"Donald Trum\": 1, \"Mike Pence\": 2, \"Kamala Harris\": 1}, \"ne_title_location\": {}, \"ne_title_organization\": {}, \"ne_title_person\": {\"Biden\": 1, \"Trump\": 1}, \"paragraph_count\": 4.0, \"simhash\": \"8e51fde2aae7ced97cb0ff9802a1df44\", \"spacy_content_loc\": [\"Washington\", \"US\", \"US\", \"Nashville\", \"Tennessee\", \"US\"], \"spacy_content_num\": [], \"spacy_content_org\": [\"XYZ\"], \"spacy_content_per\": [\"Nikhila Natarajan\", \"Mike Pence\", \"Kamala Harris - Mike Pence\", \"Donald Trum\"], \"spacy_content_tim\": [\"Oct 23\", \"2020\", \"the year\", \"90 minute\", \"Thursday\", \"night\"], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [\"Trump\", \"Biden\"], \"spacy_title_per\": [], \"spacy_title_tim\": [], \"src\": \"Social News XYZ\", \"stitle\": \"Mute button , masks headline final Trump , Biden debate\", \"text_category\": {\"first_cat\": {\"PoliticsGovernment\": 0.9220821129312872}, \"second_cat\": {\"PoliticsGovernment_Federal\": 0.8, \"PoliticsGovernment_Elections\": 0.7086743505215961}, \"third_cat\": {\"PoliticsGovernment_Federal_POTUS\": 0.8, \"PoliticsGovernment_Elections_PresidentialCandidates\": 0.6179724311215244}}, \"text_category_v2\": {\"first_cat\": {\"PoliticsGovernment\": 0.9220821129312872}, \"second_cat\": {\"PoliticsGovernment_Federal\": 0.8, \"PoliticsGovernment_Elections\": 0.7086743505215961}, \"third_cat\": {\"PoliticsGovernment_Federal_POTUS\": 0.8, \"PoliticsGovernment_Elections_PresidentialCandidates\": 0.6179724311215244}}, \"url\": \"https://mp.newsbreakapp.com/post/12548458?sig=A80A8B68E61EBF9F4B2B65E2A1F926C2\"}";
        String canditStr =
            "[" +
            "{\"_id\": \"0XP2Cd8D\", \"c_word\": 428, \"channels\": [\"Donald^^Trump\", \"Presidential^^Debate\", \"Democratic^^Debate\", \"Debates\", \"Democratic^^Candidates\"], \"channels_v2\": [\"Federal\", \"Donald^^Trump\", \"Joe^^Biden\", \"Presidential^^Debate\", \"Sharp\", \"Russia\"], \"epoch\": {\"$numberLong\": \"1603419840\"}, \"geotag\": [], \"geotag_v2\": [], \"highlightkeyword_list\": [[\"Joe^^Biden\", 0.9716584759556113], [\"Donald^^Trump\", 0.9561559403861298], [\"NBC^^News\", 0.039192748843770275], [\"Kristen^^Welker\", 0.033825558442444226], [\"Chris^^Wallace\", 0.01418875964657476], [\"Lisa^^Hagen\", 2.0237006167271595E-4], [\"Nashville\", 9.557322860427714E-7], [\"China\", 8.796744741476075E-7], [\"Cleveland\", 8.666353109947745E-7], [\"Russia\", 8.575794267469866E-7]], \"insert_time\": \"2020-10-23 02:49:37\", \"kw_title\": [\"sharp^^exchanges\", \"Trump\", \"President^^Donald^^Trump\", \"Joe^^Biden\", \"Sharp\"], \"kws\": [\"sharp^^exchanges\", \"Trump\", \"presidential^^debate\", \"Presidential^^Debates\", \"President^^Donald^^Trump\", \"Debates\", \"debate^^moderator\", \"Joe^^Biden\", \"Sharp\", \"mute^^candidates\", \"Election\", \"Congress\", \"Russia\", \"China\", \"optimism\", \"Cartoons\", \"NBC^^News\", \"NBC\", \"taxes\", \"Chris^^Wallace\"], \"ne_content_location\": {\"Nashville\": 1, \"Cleveland\": 1, \"China\": 1, \"Russia\": 1}, \"ne_content_organization\": {\"Commission on Presidential Debates\": 1, \"Congress\": 1, \"U.S. News & World\": 1, \"NBC News\": 1, \"Fox News\": 1}, \"ne_content_person\": {\"Lisa Hagen\": 2, \"Donald Trump\": 1, \"Biden\": 4, \"Joe Biden\": 1, \"Chris Wallace\": 1, \"Kristen Welker\": 1, \"Welker\": 1, \"Trump\": 6}, \"ne_title_location\": {}, \"ne_title_organization\": {}, \"ne_title_person\": {\"Biden\": 1, \"Trump\": 1}, \"paragraph_count\": 13.0, \"simhash\": \"afdaeeeb6ad669977c38b1c69b043b60\", \"spacy_content_loc\": [\"Nashville\", \"Russia\", \"China\", \"Cleveland\"], \"spacy_content_num\": [\"second\", \"first\", \"first\", \"one\"], \"spacy_content_org\": [\"Democratic\", \"Trump\", \"Biden\", \"Presidential Debates\", \"Trump\", \"NBC News\", \"Trump\", \"Fox News\", \"Trump\", \"Biden\", \"Trump\", \"Trump\", \"Biden\", \"U.S. News & World Report\", \"Congress\"], \"spacy_content_per\": [\"Donald Trump\", \"Joe Biden\", \"Kristen Welker\", \"Welker\", \"Chris Wallace\", \"Biden\", \"Lisa Hagen\", \"Lisa Hagen\"], \"spacy_content_tim\": [\"last month 's\", \"Thursday\", \"the first two minutes\", \"September\", \"September\", \"Nov. 3\", \"a matter of weeks\", \"the end of the year\", \"2020\"], \"spacy_title_loc\": [], \"spacy_title_num\": [], \"spacy_title_org\": [\"Trump\", \"Biden\", \"Sharp Exchanges\"], \"spacy_title_per\": [], \"spacy_title_tim\": [], \"src\": \"US News and World Report\", \"stitle\": \"Trump , Biden Clash in Sharp Exchanges , But More Civil Tones\", \"text_category\": {\"first_cat\": {\"PoliticsGovernment\": 0.9259256846332614}, \"second_cat\": {\"PoliticsGovernment_Federal\": 0.8, \"PoliticsGovernment_Elections\": 0.6698985474804305}, \"third_cat\": {\"PoliticsGovernment_Federal_POTUS\": 0.8, \"PoliticsGovernment_Elections_PresidentialCandidates\": 0.6820541437867856}}, \"text_category_v2\": {\"first_cat\": {\"PoliticsGovernment\": 0.9259256846332614}, \"second_cat\": {\"PoliticsGovernment_Federal\": 0.8, \"PoliticsGovernment_Elections\": 0.6698985474804305}, \"third_cat\": {\"PoliticsGovernment_Federal_POTUS\": 0.8, \"PoliticsGovernment_Elections_PresidentialCandidates\": 0.6820541437867856}}, \"url\": \"https://www.usnews.com/news/elections/articles/2020-10-22/trump-biden-clash-in-sharp-exchanges-but-in-more-civil-tones\"}" +
            "]";
        List<double[]> indexList = predictOnline(forest, mapper.readTree(masterStr), mapper.readTree(canditStr));
        for (double[] weight : indexList) {
            System.out.println(String.valueOf(weight[0]) + "\t" + String.valueOf(weight[1]) + "\t" + String.valueOf(weight[2]));
        }
        
//        /** Model Inference STD Estimate */
//        String onlineModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201014/forest.model";
//        String testModelPath = "/Users/yuxi/NB/RandomForest/_local/train/20201116/forest.model";
//        String estimateDataPath = "/Users/yuxi/NB/RandomForest/_local/estimate/estimate_doc_pair_fields";
//        RandomForest onlineForest = (RandomForest) SerializationHelper.read(onlineModelPath);
//        RandomForest testForest = (RandomForest) SerializationHelper.read(testModelPath);
//        predictEstimateDataFeatureV1(onlineForest, estimateDataPath);
//        predictEstimateDataFeatureV2(testForest, estimateDataPath);
//
        
    }
}