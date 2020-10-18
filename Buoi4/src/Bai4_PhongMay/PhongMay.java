package Bai4_PhongMay;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private String dienTich;
    private QuanLy quanLy;
    ArrayList<May> may = new ArrayList<>();

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, String dienTich, QuanLy quanLy, ArrayList<May> may) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.quanLy = quanLy;
        this.may = may;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public ArrayList<May> getMay() {
        return may;
    }

    public void setMay(ArrayList<May> may) {
        this.may = may;
    }

    @Override
    public String toString() {
        return "PhongMay{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", quanLy=" + quanLy +
                ", may=" + may +
                '}';
    }
    public void InputPhongMay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma phong: ");
        this.maPhong = sc.nextLine();
        System.out.println("Moi nhap ten phong: ");
        this.tenPhong = sc.nextLine();
        System.out.println("Moi nhap dien tich: ");
        this.dienTich = sc.nextLine();
        quanLy = new QuanLy();
        quanLy.InputQuanLy();
        System.out.println("Nhap so may");
        int n;
        n = sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Nhap thong tin may thu " +i+": ");
            May x = new May();
            x.InputMay();
            may.add(x);
        }
    }
}
