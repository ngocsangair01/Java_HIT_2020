package Bai5_Class;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private String khoaHoc;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Moi nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("Moi nhap nganh hoc: ");
        this.nganh = sc.nextLine();
        System.out.println("Moi nhap khoa hoc: ");
        this.khoaHoc = sc.nextLine();
    }
    public void Output(){
        Scanner sc = new Scanner(System.in);
        super.show();
        SinhVien x = new SinhVien();
        x.show();
    }
}
