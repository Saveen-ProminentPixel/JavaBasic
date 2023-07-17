package Interface;

public class Member {

    String name;
    int age;
    String phoneNo;
    String address;
    int salary;

    public Member(String name, int age, String phoneNo, String address, int salary){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void printSalary(){

        System.out.println("Salary : " + this.salary);
    }
}

