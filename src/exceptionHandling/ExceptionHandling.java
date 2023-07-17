package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) throws InvalidSalaryException{

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your salary : ");
        int salary = sc.nextInt();


        if(salary > 87000){
            throw new InvalidSalaryException("Salary is not valid!!");
        }
        else{
            System.out.println("your salary is : " + salary);
        }


    }

}
