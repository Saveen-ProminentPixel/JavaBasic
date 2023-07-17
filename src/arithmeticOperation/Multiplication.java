package arithmeticOperation;

public class Multiplication extends ArithmeticOperations{

    @Override
    public void perform(int a, int b) {
        int ans = a*b;
        System.out.println("Multiplication : " + ans);
    }
}
