package Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee a = new Employee(1,"Dang Mang","Cuong",100);
        System.out.println(a.getName());
        System.out.println(a.getAnnualSalary());
        System.out.println(a.raiseSalary(15));
    }
}
