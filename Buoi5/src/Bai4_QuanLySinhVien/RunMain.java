package Bai4_QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList <SinhVien> sinhViens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("============Wellcome============");
            System.out.println("Chon 1: Them sinh vien: ");
            System.out.println("Chon 2: Sua thong tin sinh vien:");
            System.out.println("Chon 3: Xoa thong tin sinh vien:");
            System.out.println("Chon 4: Sap xep thong tin sinh vien theo gpa:");
            System.out.println("Chon 5: sap xwep thong tin sinh vien theo ten: ");
            System.out.println("Chon 6: Xuat thong tin sinh vien: ");
            System.out.println("Chon 0: thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    SinhVien x = new SinhVien();
                    System.out.println("Moi thong tin sinh vien can them: ");
                    x.Input();
                    sinhViens.add(x);
                    break;
                case 2:
                    System.out.println("Moi nhap thong tin sinh vien can sua: ");
                    SinhVien x = new SinhVien();
                    x.Input();
                    sinhViens.remove();
                    sinhViens.add(x);
                case 3:
                case 4:
                case 5:
                case 6:
                case 0:
                    System.out.println("Ban da thoat chuong trinh "); return;
                default:
                    System.out.println("khong hop le, moi ban nhap lai");
            }

        }while (true);
    }


}
