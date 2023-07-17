package arithmeticOperation;

public class Division extends ArithmeticOperations{

    @Override
    public void perform(int a, int b) {
        int ans = a/b;
        System.out.println("Division : " + ans);
    }
}
