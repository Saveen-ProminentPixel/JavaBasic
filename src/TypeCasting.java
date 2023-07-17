public class TypeCasting {

    public static void main(String[] args){

        // Widening Casting

        System.out.println();
        System.out.println("// Widening TypeCasting //");
        System.out.println();
        int a = 5;
        long al = a;
        float af = a;
        double ad = a;

        System.out.println("Integer : " + a);
        System.out.println("Integer to Long : " + al);
        System.out.println("Integer to float : " + af);
        System.out.println("Integer to double : " + ad);
        System.out.println();

        byte b = 100;
        short bs = b;
        int bi = b;

        System.out.println("Byte : " + b);
        System.out.println("Byte to short : " + bs);
        System.out.println("Byte to int : " + bi);
        System.out.println();


        // Narrowing Typecasting

        System.out.println("// Narrowing Typecasting");
        System.out.println();

        double d = 782569.6554;
        float df = (float) d;
        long dl = (long) d;
        int di = (int) d;
        short ds = (short) d;
        Byte db = (byte) d;

        System.out.println("Double : " + d);
        System.out.println("Double to Float : " + df);
        System.out.println("Double to Long : " + dl);
        System.out.println("Double to Integer : " + di);
        System.out.println("Double to Short : " + ds);
        System.out.println("Double to Byte : " + db);
        System.out.println();

    }
}
