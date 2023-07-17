package arithmeticOperation;

import arithmeticOperation.ArithmeticOperations;

public class Addition extends ArithmeticOperations {

    @Override
    public void perform(int a, int b) {
        int ans = a + b;
        System.out.println("Addition : " + ans);
    }
}
