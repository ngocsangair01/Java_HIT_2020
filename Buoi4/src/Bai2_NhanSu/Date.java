package Bai2_NhanSu;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private  int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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
    public void InputDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ngay sinh: ");
        this.day = sc.nextInt();
        System.out.println("Moi nhap thang sinh: ");
        this.month = sc.nextInt();
        System.out.println("Moi nhap nam sinh: ");
        this.year = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
