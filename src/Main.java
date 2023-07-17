public class Main {
    public static void main(String[] args) {

        // Print Hello world
        PrintHelloWorld printHelloWorld = new PrintHelloWorld();
        printHelloWorld.print();

        StaticAndThis staticAndThis = new StaticAndThis("saveen",1);
        System.out.println(staticAndThis.name);

        staticAndThis.changeName("Yash");
        System.out.println(staticAndThis.name);


    }
}