package Bai2_SoPhuc;

import java.util.Scanner;

public class SoPhuc {
    private int thuc;
    private int ao;

    public SoPhuc() {
    }

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                "thuc=" + thuc +
                ", ao=" + ao +
                '}';
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap a: ");
        this.thuc = sc.nextInt();
        System.out.println("Moi nhap b: ");
        this.ao = sc.nextInt();
    }
    public void Output(){
        System.out.println("a= "+thuc);
        System.out.println("b= "+ao);
    }
    public SoPhuc Plus(SoPhuc a) {
        SoPhuc a = new SoPhuc();
        a.thuc = this.thuc + a.thuc;
        a.ao = this.ao + a.ao;
        return a;
    }
    public SoPhuc Minus(SoPhuc b) {
        SoPhuc b = new SoPhuc();
        b.thuc = this.thuc-b.thuc;
        b.ao = this.ao - b.ao;
        return b;
    }
}
