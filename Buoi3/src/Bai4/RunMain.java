package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Array a = new Array();
        Array b = new Array();
        a.InputData();
        a.Show();
        a.Sum();
        b.InputData();
        b.Show();
        b.Sum();
        if(a.Sum() > b.Sum()) {
            System.out.println("Mang a lon hon");
        }
        if(a.Sum() < b.Sum()) {
            System.out.println("Mang b lon hon");
        }else {
            System.out.println("Hi");
        }
    }
}
