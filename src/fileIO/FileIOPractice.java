package fileIO;

import java.io.*;

public class FileIOPractice {

    public static void main(String[] args) throws IOException {

        File f = new File("abc.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Hello World");
        pw.println("Java is a programming language");
        pw.println("Prominent Pixel");
        pw.flush();
        pw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }

        br.close();

    }
}
