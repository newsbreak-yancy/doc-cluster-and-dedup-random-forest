import com.mongodb.BasicDBObject;
import com.mongodb.client.*;
import org.apache.commons.io.FileUtils;
import org.bson.Document;
import weka.core.*;
import weka.core.converters.ArffSaver;
import weka.core.pmml.VectorInstance;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Random;

import static com.mongodb.client.model.Filters.eq;

/**
 *
 */
public class ARFFUtils {

    public static MongoCollection<Document> collectionStatic;
    public static MongoCollection<Document> collectionCenter;
    public static BasicDBObject fields;

    static {
        String uriStatic = "mongodb://172.24.25.74/staticFeature";
        MongoClient clientStatic = MongoClients.create(uriStatic);
        MongoDatabase dbStatic = clientStatic.getDatabase("staticFeature");
        collectionStatic = dbStatic.getCollection("document");

        String uriCenter = "mongodb://172.31.16.143/docenter";
        MongoClient clientCenter = MongoClients.create(uriCenter);
        MongoDatabase dbCenter = clientCenter.getDatabase("docenter");
        collectionCenter = dbCenter.getCollection("document");
        fields = new BasicDBObject("_id", 1).append("c_word", 1).append("channels", 1)
                .append("content_type", 1).append("countries", 1)
                .append("date", 1).append("domain", 1).append("geotag", 1)
                .append("highlightkeyword_list", 1).append("kw_title", 1)
                .append("kws", 1).append("media_id", 1)
                .append("ne_content_location", 1).append("ne_content_organization", 1)
                .append("ne_content_person", 1).append("ne_title_location", 1)
                .append("ne_title_organization", 1).append("ne_title_person", 1)
                .append("paragraph_count", 1).append("predicate_content", 1)
                .append("predicate_title", 1).append("seg_content_paragraph_starts", 1)
                .append("spacy_content_loc", 1).append("spacy_content_num", 1)
                .append("spacy_content_org", 1).append("spacy_content_otr", 1)
                .append("spacy_content_per", 1).append("spacy_content_tim", 1)
                .append("spacy_title_loc", 1).append("spacy_title_num", 1)
                .append("spacy_title_org", 1).append("spacy_title_otr", 1)
                .append("spacy_title_per", 1).append("spacy_title_tim", 1)
                .append("seg_content", 1).append("stitle", 1).append("text_category", 1)
                .append("title_c_count", 1).append("simhash", 1).append("url", 1)
                .append("src", 1).append("epoch", 1).append("tpc_m", 1);
    }


    public static void extractDocFields(File docPair) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(docPair));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(docPair.getAbsolutePath() + "_fields")));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] datas = line.split("\t");
            String docIDm = datas[0];
            String docIDc = datas[1];

            Document docMaster = collectionCenter.find(eq("_id", docIDm)).projection(fields).first();
            Document docCandit = collectionCenter.find(eq("_id", docIDc)).projection(fields).first();
            bw.write(line);
            System.out.println(line);
            if (docMaster != null && docCandit != null) {
                bw.write("\t");
                bw.write("SUCCESS");
                bw.write("\t");
                bw.write(docMaster.toJson());
                bw.write("\t");
                bw.write(docCandit.toJson());
                bw.write("\n");
            } else {
                bw.write("\t");
                bw.write("FAILED");
                bw.write("\n");
            }
        }
        bw.close();
    }
    
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
        // add
        instances.add(new DenseInstance(1.0, vals));
    
        // second instance
        vals = new double[instances.numAttributes()];  // important: needs NEW array!
        // - numeric
        vals[0] = Math.E;
        // - nominal
        vals[1] = attVals.indexOf("val1");
        // - string
        vals[2] = instances.attribute(2).addStringValue("And another one!");
        // - date
        vals[3] = instances.attribute(3).parseDate("2000-12-01");
        // - relational
        dataRel = new Instances(instances.attribute(4).relation(), 0);
        // -- first instance
        valsRel = new double[2];
        valsRel[0] = Math.E + 1;
        valsRel[1] = attValsRel.indexOf("val5.4");
        dataRel.add(new DenseInstance(1.0, valsRel));
        // -- second instance
        valsRel = new double[2];
        valsRel[0] = Math.E + 2;
        valsRel[1] = attValsRel.indexOf("val5.1");
        dataRel.add(new DenseInstance(1.0, valsRel));
        vals[4] = instances.attribute(4).addRelation(dataRel);
        // add
        instances.add(new DenseInstance(1.0, vals));
    }
    
    
    public static double nextDouble(final double min, final double max) {
        return min + ((max - min) * new Random().nextDouble());
    }
    

    public static void buildARFF(String fileName) throws Exception {
        FastVector attributes;
        FastVector attsRel;
        FastVector attVals;
        FastVector attValsRel;
        Instances instances;
        Instances dataRel;
        double[] vals;
        double[] valsRel;
        int i;
        
        // 1. set up attributes
        attributes = new FastVector();
        // - numeric
        attributes.addElement(new Attribute("OverlapRatioORG"));
        attributes.addElement(new Attribute("OverlapRatioLOC"));
        attributes.addElement(new Attribute("OverlapRatioPRS"));
        // - nominal
        attVals = new FastVector();
        attVals.addElement("DIFF");
        attVals.addElement("EVENT");
        attVals.addElement("DUP");
        attributes.addElement(new Attribute("Label", attVals));
    
        // 2. create Instances object
        instances = new Instances(fileName, attributes, 300);
        instances.setClassIndex(instances.numAttributes() - 1);
        
        // 3. fill with data
        for (int j = 0; j < 100; j++) {
            // dup instance
            vals = new double[instances.numAttributes()];
            vals[0] = nextDouble(80, 100);
            vals[1] = nextDouble(80, 100);
            vals[2] = nextDouble(80, 100);
            vals[3] = attVals.indexOf("DUP");
            instances.add(new DenseInstance(1.0, vals));
            // event instance
            vals = new double[instances.numAttributes()];
            vals[0] = nextDouble(0, 20);
            vals[1] = nextDouble(0, 20);
            vals[2] = nextDouble(0, 20);
            vals[3] = attVals.indexOf("EVENT");
            instances.add(new DenseInstance(1.0, vals));
            // diff instance
            vals = new double[instances.numAttributes()];
            vals[0] = nextDouble(-30, -20);
            vals[1] = nextDouble(-30, -20);
            vals[2] = nextDouble(-30, -20);
            vals[3] = attVals.indexOf("DIFF");
            instances.add(new DenseInstance(1.0, vals));
        }
        
    
    
        // 4. dump data
        File trainFile = new File("/Users/yuxi/NB/RandomForest/src/main/resources/" + fileName + ".arff");
        System.out.println("ClassIndex:" + instances.classIndex());
        System.out.println(instances.toString());
        FileUtils.writeStringToFile(trainFile, instances.toString(), Charset.defaultCharset(), false);
    
//        ArffSaver saver = new ArffSaver();
//        saver.setFile(trainFile);
//        saver.setInstances(instances);
//        saver.writeBatch();
    }

    public static void main(String[] args) throws Exception {
        extractDocFields(new File("/Users/mia/Projects/Java/RandomForest/src/main/resources/estimate/doc_pair_0903"));
    
        buildARFF("test");
    }
}
