package Bai1_Person;

public class Employee extends Person {
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void Display() {
        System.out.println("Employee Full name: "+super.getName());
        System.out.println("Employee Address: "+super.getAddress());
        System.out.println("Employee's salary: "+salary);
    }
}
