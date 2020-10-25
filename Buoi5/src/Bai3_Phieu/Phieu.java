package Bai3_Phieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime dateTime;
    ArrayList<SanPham> sanPhams = new ArrayList<>();

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu, DateTime dateTime, ArrayList<SanPham> sanPhams) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.dateTime = dateTime;
        this.sanPhams = sanPhams;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    @Override
    public String toString() {
        return "Phieu{" +
                "maPhieu='" + maPhieu + '\'' +
                ", tenPhieu='" + tenPhieu + '\'' +
                ", dateTime=" + dateTime +
                ", sanPhams=" + sanPhams +
                '}';
    }
    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        this.maPhieu = sc.nextLine();
        System.out.println("Nhap ten phieu: ");
        this.tenPhieu = sc.nextLine();
        dateTime = new DateTime();
        dateTime.InputDate();
        System.out.println("Nhap so san pham: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Nhap thong tin san pham thu " +i);
            SanPham x = new SanPham();
            x.InputSP();
            sanPhams.add(x);
        }
    }
    public void OutputPhieu(){
        System.out.println("Thong tin phieu vua nhap la: ");
        System.out.println("Ma phieu la: "+maPhieu);
        System.out.println("Ten phieu la: "+tenPhieu);
        System.out.println("Ngay: ");
        dateTime.OutputDate();
        System.out.println("Thong tin san pham: ");
        for (int i=0;i<sanPhams.size();i++) {
            System.out.println("San pham thu " + i);
            sanPhams.get(i).Output();
            System.out.println("Gia san pham la: "+(sanPhams.get(i).donGia*sanPhams.get(i).soLuong));
        }
        int Sum = 0;
        for (int i=0;i<sanPhams.size();i++) {
            Sum += sanPhams.get(i).donGia*sanPhams.get(i).soLuong;
        }
        System.out.println("Tong thanh tien cua "+sanPhams.size()+" san pham la:"+Sum);
    }
}
