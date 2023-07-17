public class StaticAndThis {

    String name;
    int id;
    static String city  = "Surat";


    public StaticAndThis(String name, int id){

        this.name = name;
        this.id = id;
    }

    public void changeName(String name){

        System.out.println("this method called");
        this.name = name;
        cityName();
    }

    public static void cityName(){

        System.out.println(city);

    }
}
