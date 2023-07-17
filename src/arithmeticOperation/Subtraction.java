package arithmeticOperation;

public class Subtraction extends ArithmeticOperations{

    @Override
    public void perform(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction : " + ans);
    }
}
