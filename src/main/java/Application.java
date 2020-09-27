import weka.classifiers.trees.RandomForest;

import weka.classifiers.Evaluation;
import weka.core.*;
import weka.core.converters.ArffLoader;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

    /** file names are defined*/
    public static final String TRAINING_DATA_SET_FILENAME="train.arff";
    public static final String TESTING_DATA_SET_FILENAME="test.arff";


    /**
     * This method is to load the data set.
     * @param fileName
     * @return
     * @throws IOException
     */
    public static Instances getDataSet(String fileName) throws IOException {
        int classIdx = 1;
        ArffLoader loader = new ArffLoader();
        loader.setSource(Application.class.getResourceAsStream("/" + fileName));
        Instances dataSet = loader.getDataSet();
        dataSet.setClassIndex(classIdx);
        return dataSet;
    }

    /**
     * This method is used to train the input and return the statistics.
     *
     * @throws Exception
     */
    public static void train() throws Exception {

        Instances trainingDataSet = getDataSet(TRAINING_DATA_SET_FILENAME);
        trainingDataSet.setClassIndex(3);
        Instances testingDataSet = getDataSet(TESTING_DATA_SET_FILENAME);
        testingDataSet.setClassIndex(3);

        RandomForest forest = new RandomForest();
        forest.setNumIterations(1);
        forest.setBatchSize("10");
        forest.setDebug(true);
        forest.setNumFeatures(2);
        forest.setMaxDepth(2);
        forest.buildClassifier(trainingDataSet);
        System.out.println(forest);
    
        Evaluation eval = new Evaluation(trainingDataSet);
        eval.evaluateModel(forest, testingDataSet);
    
        

        /** Print the algorithm summary */
        System.out.println("** Decision Tress Evaluation with Datasets **");
        System.out.println(eval.toSummaryString());
        System.out.print(" the expression for the input data as per alogorithm is ");
        System.out.println(forest);
        
        // dump random forest model to file
        SerializationHelper.write("/Users/yuxi/NB/RandomForest/src/main/resources/forest.model", forest);

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
    
    public static void predict2() throws Exception {
        RandomForest forest = (RandomForest) SerializationHelper.read("/Users/yuxi/NB/RandomForest/src/main/resources/forest.model");
        DataSource dataSource = new DataSource("/Users/yuxi/NB/RandomForest/src/main/resources/test.arff");
        Instances testDataset = dataSource.getDataSet();
        testDataset.setClassIndex(testDataset.numAttributes() - 1);
        for (Instance instance : testDataset) {
            System.out.println(forest.classifyInstance(instance));
        }
    }

    public static void main(String[] args) throws Exception {
//        train();
        predict2();
    }
}