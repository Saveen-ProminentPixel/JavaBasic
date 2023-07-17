package fileIO;

import java.io.*;

public class UTF8File {

    public static void main(String[] args) throws IOException {

        File f = new File("utf_file.csv");
        f.createNewFile();

//        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("∮ E⋅da = Q,  n → ∞, ∑ f(i) = ∏ g(i), ∀x∈ℝ: ⌈x⌉ = −⌊−x⌋, α ∧ ¬β = ¬(¬α ∨ β),");
        dos.flush();
        dos.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();

        String[] st = line.split(",");
        for(String s : st){
            System.out.println(s);
        }

    }
}
