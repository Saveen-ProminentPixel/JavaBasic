package Interface;

public class Main {

    public static void main(String[] args){

        Employee employee = new Employee("Rahul",35,"8956235689","Udhna, Surat",20000,"Frontend developer");
        employee.printSalary();

        Manager manager = new Manager("Manish",47,"9876987569","Vesu, Surat",70000,"Production");
        manager.printSalary();

        System.out.println("Employee details : ");
        System.out.println(" Name - " + employee.name + ", Age - " + employee.age + ", PhoneNo - " + employee.phoneNo + ", Address - " + employee.address + ", Salary - " + employee.salary + ", Specialization - " + employee.specialization);
        System.out.println("Manager details : ");
        System.out.println(" Name - " + manager.name + ", Age - " + manager.age + ", PhoneNo - " + manager.phoneNo + ", Address - " + manager.address + ", Salary - " + manager.salary + ", Department - " + manager.department);
    }

}
