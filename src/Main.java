import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //  Console to file
        try {
            File file = new File("test1.txt");
            Scanner sc = new Scanner(System.in);
            String consoleWrite = sc.next();
            FileWriter fw = new FileWriter(file);
            fw.write(consoleWrite);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            File file = new File("test1.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String firstLine = br.readLine();
            System.out.println(firstLine);
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // file to file
            File file1 = new File("test1.txt");
            File file = new File("test2.txt");
            try (FileReader fr = new FileReader(file1);
                 FileWriter fw = new FileWriter(file)){
                int bytes;
                while ((bytes = fr.read()) != -1) {
                    fw.write(bytes);
                }
            }
         catch (IOException e) {
             System.out.println(e);
             System.exit(-1);
        }
            // file to console
        try{
            File file2 = new File("test1.txt");
            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);
            String read = br.readLine();
            System.out.println(read);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}