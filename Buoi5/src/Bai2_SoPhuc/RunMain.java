package Bai2_SoPhuc;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();
        System.out.println("Moi nhap a: ");
        a.Input();
        System.out.println("Moi nhap b: ");
        b.Input();
        SoPhuc c= a.Plus(b);
        SoPhuc d = a.Minus(b);
        System.out.println("a+b= ");
        c.Output();

        System.out.println("a -b= ");
        d.Output();
    }
}
