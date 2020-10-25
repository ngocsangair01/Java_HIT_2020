package Bai5_Class;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi nhap nam sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Moi nhap que quan: ");
        this.queQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
    public void show() {
        Nguoi x = new Nguoi();
        System.out.println(x.toString());
    }
}
