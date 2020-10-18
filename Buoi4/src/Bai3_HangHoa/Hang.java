package Bai3_HangHoa;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private String donGia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, String donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Hang{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia='" + donGia + '\'' +
                '}';
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.println("Moi nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Moi nhap don dia: ");
        this.donGia = sc.nextLine();
    }
}
