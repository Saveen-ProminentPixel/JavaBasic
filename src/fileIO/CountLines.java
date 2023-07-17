package fileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CountLines {
    public static void main(String[] args) throws IOException {

        String s = "E:\\Saveen\\Java";
        countLinesInTheFile(s);

//        List<Path> paths= Files.walk(Paths.get("E:\\Saveen\\Java")).filter(Files::isRegularFile).collect(Collectors.toList());
//
//        paths.stream().forEach(f-> {
//
//            BufferedReader br = null;
//            try {
//                br = new BufferedReader(new FileReader(f.toFile()));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("File name is " + f.toFile().getName());
//                String line;
//
//                while (true) {
//                    try {
//                        if (!((line = br.readLine()) != null)) break;
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
////                    System.out.println(line);
//                }
//        });

    }

    public static void countLinesInTheFile(String s) throws IOException {

        File f = new File(s);

        String[] list = f.list();

        for(String st : list){

            String file = s + "\\" + st;
            File f1 = new File(file);
            if(f1.isDirectory()){
                countLinesInTheFile(file);
            }
            else if(f1.isFile()){
                BufferedReader br = new BufferedReader(new FileReader(f1));
                String line = br.readLine();
                int count = 0;
                while(line != null){
                    count++;
                    line = br.readLine();
                }
                System.out.println("File name : " + f1.getName() + " || no. of lines : " + count);
            }

        }

    }
}
