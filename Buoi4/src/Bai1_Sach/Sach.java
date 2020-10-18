package Bai1_Sach;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soTrang;
    private int giaTien;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nhaXuatBan, int soTrang, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    public void Input() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Moi nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.println("Moi nhap ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.println("Moi nhap nha xuat ban: ");
        this.nhaXuatBan = sc.nextLine();
        System.out.println("Moi nhap so tien: ");
        this.giaTien = sc.nextInt();
        System.out.println("Moi nhap so trang: ");
        this.soTrang = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soTrang=" + soTrang +
                ", giaTien=" + giaTien +
                '}';
    }
}
