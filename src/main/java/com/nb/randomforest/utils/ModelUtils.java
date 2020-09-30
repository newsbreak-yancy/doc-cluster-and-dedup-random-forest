package com.nb.randomforest.utils;

import weka.classifiers.trees.RandomForest;

import weka.classifiers.Evaluation;
import weka.core.*;
import weka.core.converters.ArffLoader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ModelUtils {

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
    
    public static void predictABModel() throws Exception {
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/_local/train/20200929/forest.model");
        DataSource dataSource = new DataSource("/Users/yuxi/NB/RandomForest/src/main/resources/test.arff");
        Instances testDataset = dataSource.getDataSet();
        testDataset.setClassIndex(testDataset.numAttributes() - 1);
        for (Instance instance : testDataset) {
            System.out.println(forest.classifyInstance(instance));
        }
    }
    
    public static void predictOLModel() throws Exception {
    
    }

    public static void main(String[] args) throws Exception {
        
        /** Model Training */
//        String trainFile = "/Users/yuxi/NB/RandomForest/_local/train/20200929/train.arff";
//        String testFile = "/Users/yuxi/NB/RandomForest/_local/train/20200929/test.arff";
//        train(trainFile, testFile);
        
        /** Model Inference ABTEST*/
//        predictABModel();
        
        /** Model Inference ONLINE */
        
        
    }
}