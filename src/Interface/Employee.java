package Interface;

public class Employee extends Member{

    String specialization;

    public Employee(String name, int age, String phoneNo, String address, int salary, String specialization) {

        super(name, age, phoneNo, address, salary);

        this.specialization = specialization;

    }
}
