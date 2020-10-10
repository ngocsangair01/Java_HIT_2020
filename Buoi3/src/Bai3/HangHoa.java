package Bai3;

import java.util.Scanner;

public class HangHoa {
    private int MaHang;
    private String TenHang;
    private int SoLuong;
    private int DonGia;

    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, int soLuong, int donGia) {
        MaHang = maHang;
        TenHang = tenHang;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }
    public void Show() {
        System.out.println(MaHang+"\t"+TenHang+"\t"+SoLuong+"\t"+DonGia+"\t"+(SoLuong*DonGia));
    }
    public void Input() {
        System.out.println("Moi nhap ma mat hang ");
        this.setMaHang(new Scanner(System.in).nextInt());
        System.out.println("Nhap ten mat hang: ");
        this.setTenHang(new Scanner(System.in).nextLine());
        System.out.println("Moi nhap so luong :");
        this.setSoLuong(new Scanner(System.in).nextInt());
        System.out.println("Moi nhap don gia: ");
        this.setDonGia(new Scanner(System.in).nextInt());
    }
}
