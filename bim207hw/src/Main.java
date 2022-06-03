import java.io.*;
import java.util.*;

public class Main{

    public Main(String fileName, int topN) throws IOException {
        //computeAvgLengthByFirstChar();
        //Set pairs = calculateMinPairDist();
    }


    public static void computeAvgLengthByFirstChar(String word) { }

    private Set calculateMinPairDist(String tokens) { return null; }

    private void getFactor(){}


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\javademos\\bim207hw\\src\\sampleText.txt"));
        //Read words from file.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] parts = line.split(" ");
            for (String part : parts) {
                part=part.toLowerCase();
                part=part.replace(",","");
                part=part.replace(".","");
                part=part.replace("'","");
                part=part.replace("-","");
                System.out.println(part);
            }
        }
        reader.close();
    }
}