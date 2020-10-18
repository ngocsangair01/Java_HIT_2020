package Bai1_Sach;


import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        ArrayList<Sach> sach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong sach: ");
        n = sc.nextInt();
        Sach s = new Sach();
        for (int i=0;i<n;i++) {

            System.out.println("Nhap thong tin sach thu" + i +": ");
            sach.add(s);
            s.Input();
        }
        for (int i=0;i<n;i++) {
            System.out.println(s.toString());
        }
    }
}
