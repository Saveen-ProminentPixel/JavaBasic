package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
            String s = br.readLine();
            System.out.println(s);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Closing the resources");
        }

    }

}
