package arithmeticOperation;

import arithmeticOperation.*;

import java.util.Scanner;

public class ClassAndObjects {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter second number : ");
        int b = sc.nextInt();

        ArithmeticOperations addition = new Addition();
        addition.perform(a,b);

        ArithmeticOperations subtraction = new Subtraction();
        subtraction.perform(a,b);

        ArithmeticOperations multiplication = new Multiplication();
        multiplication.perform(a,b);

        ArithmeticOperations division = new Division();
        division.perform(a,b);

    }
}
