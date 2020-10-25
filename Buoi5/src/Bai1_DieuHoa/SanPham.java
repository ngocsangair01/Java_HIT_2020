package Bai1_DieuHoa;

import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String tenHangSanXuat;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String tenHangSanXuat, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNhap = ngayNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
    public void Input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma san pham: ");
        this.maSanPham = sc.nextLine();
        System.out.println("Moi nhap ten san pham: ");
        this.tenSanPham = sc.nextLine();
        System.out.println("Moi nhap ten hang san xuat: ");
        this.tenHangSanXuat = sc.nextLine();
        System.out.println("Moi nhap ngay nhap hang: ");
        this.ngayNhap = sc.nextLine();
    }
    public void Output() {
        System.out.println("Ma san pham la: "+maSanPham);
        System.out.println("Ten san pham la: "+tenSanPham);
        System.out.println("Ten hang san xuat la: "+tenHangSanXuat);
        System.out.println("Ngay nhap hang la: "+ngayNhap);
    }
}
