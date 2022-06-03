import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("D:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("dosya oluşturuldu");
            } else {
                System.out.println("dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("D:\\javademos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya boyutu : " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("D:\\javademos\\files\\students.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public  static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\javademos\\files\\students.txt", true));
            writer.newLine();
            writer.write("Can");
            System.out.println("Dosyaya yazıldı");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
