import java.util.Scanner;

public class JavaWorking {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = sc.next();
        System.out.println("Enter Middle Name : ");
        String middleName = sc.next();
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();

        System.out.println("First Name : " + firstName);
        System.out.println("Middle Name : " + middleName);
        System.out.println("Last Name : " + lastName);

    }
}
