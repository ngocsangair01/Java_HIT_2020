package Bai2_NhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date date;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String hoTen, Date date) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.date = date;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void InputNhanSu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma nhan su: ");
        this.maNhanSu = sc.nextLine();
        System.out.println("Moi nhap ho va ten nhan su: ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi nhap thong tin ve ngay: ");
        date = new Date();
        date.InputDate();

    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "maNhanSu='" + maNhanSu + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", date=" + date +
                '}';
    }
}
