import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int tolal=0;
        try {
            reader=new BufferedReader(new FileReader("D:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
            String line=null;
            while ((line=reader.readLine())!=null){
                tolal+=Integer.valueOf(line);
            }
            System.out.println("Toplam : "+tolal);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
