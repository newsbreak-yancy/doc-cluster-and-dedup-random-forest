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
        forest.setNumIterations(200);
        forest.setDebug(false);
        forest.setNumFeatures(4);
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
            if (evtScr > 0.95) {
                ppDUP++;
                pCls = "DUP";
                if (StringUtils.equals(rCls, pCls)) {
                    tpDUP++;
                }
            } else if (evtScr > 0.8d) {//EVENT
                if (!StringUtils.equals(rCls, "DUP")) {
                    ppEVT++;
                }
                pCls = "EVENT";
//                if (StringUtils.equals(rCls, "DUP") || StringUtils.equals(rCls, "EVENT")) {
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
            instances.add(new EventFeature(masterNode, canditNode, null).toInstance());
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
        
        String rootDir = "/Users/yuxi/NB/RandomForest/_local/train/20201014_1/";

        /** Model Training */
        String trainARFFPath = Paths.get(rootDir, "train.arff").toString();
        String testARFFPath = Paths.get(rootDir, "test.arff").toString();
//        train(trainARFFPath, testARFFPath);

        /** Model Inference ABTEST*/
        RandomForest forest = (RandomForest) SerializationHelper.read(Paths.get(rootDir, "forest.model").toString());
        predictABTestBasedARFF2Class(forest, Paths.get(rootDir, "test_fields").toString());
        
//        /** Model Inference ONLINE */
//        ObjectMapper mapper = new ObjectMapper();
//        String masterStr = "{\"c_word\" : 588, \"channels\" : [ \"Snapchat^^Users\", \"Instagram\", \"Facebook^^Inc.\", \"Social^^Media^^Content\", \"Active^^Users\" ], \"channels_v2\" : [ \"Social^^Media\", \"TikTok\", \"Active^^Users\", \"Snapchat\", \"Hashtag\" ], \"dup_id\" : \"0XIFnJc7\", \"epoch\" : 1602595003, \"evt_id\" : \"0XHXHZ8Y\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-10-13 17:49:29\", \"kws\" : [ \"real^^followers\", \"Instagram\", \"Hashtags\", \"Snapchat\", \"Facebook\", \"active^^users\", \"social^^media^^apps\", \"Sharing^^Content\", \"uploading^^videos\", \"likes\", \"videos\", \"websites\", \"Popular^^Songs\", \"video\", \"important^^things\", \"conversation\", \"newer^^people\", \"time\", \"happy\", \"today\" ], \"nbr_id\" : \"0XHXHZ8Y\", \"ne_content_location\" : {}, \"ne_content_organization\" : { \"Instagram\" : 1, \"Facebook\" : 1, \"TikTok\" : 1 }, \"ne_content_person\" : { \"Spotify\" : 1, \"Hashtags\" : 1, \"Tiktok\" : 1 }, \"paragraph_count\" : 15.0, \"simhash\" : \"d4e9aeeae889d1ab3a61f64b8236565a\", \"src\" : \"programminginsider.com\", \"stitle\" : \"How to Increase Followers on TikTok\", \"text_category\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.999937534332275, \"TechnologyElectronics\" : 1.00000488758087 }, \"second_cat\" : { \"ArtsEntertainment_Other\" : 0.999937534332275, \"TechnologyElectronics_Internet\" : 0.968924403190613 } }, \"text_category_v2\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.670592690922277 }, \"second_cat\" : { \"ArtsEntertainment_TV\" : 0.712832699158752 }, \"third_cat\" : { \"ArtsEntertainment_TV_OnlineVideo\" : 0.713578089647936 } }, \"url\" : \"https://programminginsider.com/how-to-increase-followers-on-tiktok/\" }";
//        String canditStr = "[{\"c_word\" : 471, \"channels\" : [ \"Teenagers\", \"Instagram\", \"Snapchat\", \"WhatsApp\" ], \"channels_v2\" : [ \"TikTok\", \"Snapchat\", \"Social^^Media\", \"Piper^^Sandler\", \"Music^^Industry\", \"Investment^^Banking\", \"Mark^^Zuckerberg\" ], \"dup_id\" : \"0XIR65L8\", \"epoch\" : 1602622345, \"evt_id\" : \"0XHXHZ8Y\", \"geotag\" : [], \"geotag_v2\" : [], \"insert_time\" : \"2020-10-14 08:44:43\", \"kws\" : [ \"Teens\", \"Instagram^^Stories\", \"Instagram\", \"Snapchat\", \"long-time^^Instagram^^users\", \"social\", \"habits\", \"Digital^^Music^^News\", \"Facebook-owned^^platforms\", \"WhatsApp\", \"behind-the-scenes^^offers\", \"Musical.ly\", \"music^^industry\", \"Piper^^Sandler\", \"Zuckerberg\", \"Oculus^^Rift\", \"Copying^^aspects\", \"Reels\", \"ByteDance\" ], \"nbr_id\" : \"0XIFnJc7\", \"ne_content_location\" : { \"United States\" : 2, \"Lil Nas X\" : 1, \"US\" : 3, \"Snapchat\" : 1 }, \"ne_content_organization\" : { \"Instagram\" : 5, \"TikTok\" : 1, \"Digital Music News\" : 1, \"Facebook\" : 9, \"Instagram Stories\" : 1 }, \"ne_content_person\" : { \"ByteDance\" : 1, \"TikTok\" : 1, \"Fleetwood Mac\" : 1, \"Zuckerberg\" : 1, \"Piper Sandler\" : 1 }, \"ne_title_location\" : { \"US\" : 1 }, \"ne_title_organization\" : {}, \"ne_title_person\" : {}, \"paragraph_count\" : 10.0, \"simhash\" : \"d3b101e2adcb498faa57f659c6165840\", \"src\" : \"Digital Music News\", \"stitle\" : \"TikTok Is More Popular Than Instagram Among US Teens , Study Finds\", \"text_category\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.999531626701355 }, \"second_cat\" : { \"ArtsEntertainment_Other\" : 0.999531626701355 } }, \"text_category_v2\" : { \"first_cat\" : { \"ArtsEntertainment\" : 0.675440673481129, \"TechnologyElectronics\" : 0.563227407700919 }, \"second_cat\" : { \"ArtsEntertainment_TV\" : 0.677829385635729, \"TechnologyElectronics_Internet\" : 0.528321128129701, \"TechnologyElectronics_Smartphone\" : 0.554593328653523 }, \"third_cat\" : { \"ArtsEntertainment_TV_OnlineVideo\" : 0.617411759748676, \"TechnologyElectronics_Internet_Other\" : 0.528321128129701, \"TechnologyElectronics_Smartphone_Software\" : 0.554593328653523 } }, \"url\" : \"https://www.digitalmusicnews.com/2020/10/13/us-teens-prefer-tiktok-over-instagram/\" }]";
//
//        List<double[]> indexList = predictOnline(forest, mapper.readTree(masterStr), mapper.readTree(canditStr));
//        for (double[] weight : indexList) {
//            System.out.println(String.valueOf(weight[0]) + "\t" + String.valueOf(weight[1]) + "\t" + String.valueOf(weight[2]));
//        }
        
    }
}