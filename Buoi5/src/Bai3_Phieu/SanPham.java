package Bai3_Phieu;

import java.util.Scanner;

public class SanPham {
    public String maSP;
    public String tenSP;
    public int soLuong;
    public int donGia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public void InputSP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma san pham: ");
        this.maSP = sc.nextLine();
        System.out.println("Moi nhap ten san pham: ");
        this.tenSP = sc.nextLine();
        System.out.println("Moi nhap so luong: ");
        this.soLuong = sc.nextInt();
        System.out.println("Moi nhap don gia: ");
        this.donGia = sc.nextInt();
    }
    public void Output(){
        System.out.println("Ma san pham la: "+ maSP);
        System.out.println("Ten san pham la: " + tenSP);
        System.out.println("So luong san pham la: " +soLuong);
        System.out.println("Don gia san pham la: "+donGia);
    }
}
