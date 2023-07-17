import java.util.Scanner;

public class OperatorAndControlStatement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Odd number : ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("It's not an Odd number");
            return;
        }

        int a = n/2;
        for(int i=1;i<=a;i++){
            System.out.print("*");
            for(int j=i;j<=a;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=a+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("**");

        for(int i=1;i<=a;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
