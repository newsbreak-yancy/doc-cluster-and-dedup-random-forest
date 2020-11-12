package com.nb.randomforest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nb.randomforest.entity.EventFeature;
import org.apache.commons.lang3.StringUtils;
import weka.core.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 */
public class ARFFUtils {

    public static void buildARFF(String sourcePath, String dumpName) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Attribute> attributes = MyAttributeBuilder.buildMyAttributes();
    
        // 2. create Instances object
        Instances instances = new Instances(dumpName, attributes, 1);
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
                    EventFeature feature = new EventFeature(
                        mapper.readTree(mStr),
                        mapper.readTree(cStr),
                        StringUtils.equals(label, "DIFF") ? "DIFF" : "EVENT"
                    );
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
        buildARFF("/Users/yuxi/NB/RandomForest/_local/train/20201109/mixture_fields_1_1_4_shuf", "mixture_fields_1_1_4_shuf");
    }
}
