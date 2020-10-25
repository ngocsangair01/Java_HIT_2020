package Bai3_Phieu;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int month;
    private int year;

    public DateTime() {
    }

    public DateTime(int ngay, int month, int year) {
        this.ngay = ngay;
        this.month = month;
        this.year = year;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "ngay=" + ngay +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ngay: ");
        this.ngay = sc.nextInt();
        System.out.println("Moi nhap thang: ");
        this.month = sc.nextInt();
        System.out.println("moi nhap nam: ");
        this.year = sc.nextInt();
    }
    public void OutputDate(){
        System.out.println("Date = "+ngay);
        System.out.println("Month = "+month);
        System.out.println("Year = "+year);
    }
}
