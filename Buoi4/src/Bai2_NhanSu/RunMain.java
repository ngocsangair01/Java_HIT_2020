package Bai2_NhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        ArrayList<NhanSu> nhansu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan su: ");
        n = sc.nextInt();

        for (int i=0;i<n;i++) {
            NhanSu x = new NhanSu();
            x.InputNhanSu();
            nhansu.add(x);
        }
        for (int i=0;i< n;i++) {
            System.out.println(nhansu.get(i).toString());
        }
    }
}
