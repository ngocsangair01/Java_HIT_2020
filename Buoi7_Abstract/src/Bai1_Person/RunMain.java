package Bai1_Person;

public class RunMain {
    public static void main(String[] args) {
        Person p1 = new Employee("Trung","Dan Phuong",3300);
        Person p2 = new Balance("Doan","Nam Dinh",10300);
        p1.Display();
        p2.Display();
    }
}
