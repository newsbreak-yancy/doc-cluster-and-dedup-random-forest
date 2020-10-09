package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;
import weka.core.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 */
public class ARFFUtils {

    public static void instanceARFF() throws Exception {
        FastVector atts;
        FastVector attsRel;
        FastVector attVals;
        FastVector attValsRel;
        Instances instances;
        Instances dataRel;
        double[] vals;
        double[] valsRel;
        int i;
        
        // 1. set up attributes
        atts = new FastVector();
        // - numeric
        atts.addElement(new Attribute("att1"));
        // - nominal
        attVals = new FastVector();
        for (i = 0; i < 5; i++)
            attVals.addElement("val" + (i + 1));
        atts.addElement(new Attribute("att2", attVals));
        // - string
        atts.addElement(new Attribute("att3", (FastVector) null));
        // - date
        atts.addElement(new Attribute("att4", "yyyy-MM-dd"));
        // - relational
        attsRel = new FastVector();
        // -- numeric
        attsRel.addElement(new Attribute("att5.1"));
        // -- nominal
        attValsRel = new FastVector();
        for (i = 0; i < 5; i++)
            attValsRel.addElement("val5." + (i + 1));
        attsRel.addElement(new Attribute("att5.2", attValsRel));
        dataRel = new Instances("att5", attsRel, 0);
        atts.addElement(new Attribute("att5", dataRel, 0));
    
        // 2. create Instances object
        instances = new Instances("TrainingData", atts, 0);
    
        // 3. fill with data
        // first instance
        vals = new double[instances.numAttributes()];
        // - numeric
        vals[0] = Math.PI;
        // - nominal
        vals[1] = attVals.indexOf("val3");
        // - string
        vals[2] = instances.attribute(2).addStringValue("This is a string!");
        // - date
        vals[3] = instances.attribute(3).parseDate("2001-11-09");
        // - relational
        dataRel = new Instances(instances.attribute(4).relation(), 0);
        // -- first instance
        valsRel = new double[2];
        valsRel[0] = Math.PI + 1;
        valsRel[1] = attValsRel.indexOf("val5.3");
        dataRel.add(new DenseInstance(1.0, valsRel));
        // -- second instance
        valsRel = new double[2];
        valsRel[0] = Math.PI + 2;
        valsRel[1] = attValsRel.indexOf("val5.2");
        dataRel.add(new DenseInstance(1.0, valsRel));
        vals[4] = instances.attribute(4).addRelation(dataRel);
    }
    

    public static void buildARFF(String sourcePath, String dumpName) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
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
        instances = new Instances(dumpName, attributes, 1);
        instances.setClassIndex(instances.numAttributes() - 1);
        System.out.println("ClassIndex:" + instances.classIndex());
        
        // 3. dump header
        File sourceFile = new File(sourcePath);
        File dumpedFile = new File(Paths.get(sourceFile.getParentFile().getAbsolutePath(), dumpName + ".arff").toString());
//        FileUtils.writeStringToFile(dumpFile, instances.toString(), Charset.defaultCharset(), false);
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dumpedFile));
        
        bw.write(instances.toString());
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] datas = line.split("\t");
            if ("SUCCESS".equals(datas[3])) {
                String label = datas[2];
                String mStr = datas[4];
                String cStr = datas[5];
                try {
                    EventFeature feature = new EventFeature(mapper.readTree(mStr), mapper.readTree(cStr), label);
                    bw.write(feature.toString());
                    bw.write("\n");
                } catch (Exception e) {
                    System.out.println(mStr);
                    System.out.println(cStr);
                    System.out.println(label);
                }
            }
        }
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        buildARFF("/Users/yuxi/NB/RandomForest/_local/train/20200929/test_fields_1614", "test");
    }
}
