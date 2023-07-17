package Interface;

public class Manager extends Member{

    String department;

    public Manager(String name, int age, String phoneNo, String address, int salary, String department) {

        super(name, age, phoneNo, address, salary);

        this.department = department;
    }
}
