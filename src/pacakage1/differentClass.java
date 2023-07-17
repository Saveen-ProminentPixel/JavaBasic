package pacakage1;

import arithmeticOperation.Addition;
import arithmeticOperation.ArithmeticOperations;
import arithmeticOperation.Multiplication;

public class differentClass {

    public static void main(String[] args){

        ArithmeticOperations addition = new Addition();
        addition.perform(50,10);

        Multiplication multiplication = new Multiplication();
        multiplication.perform(4,7);

    }


}
