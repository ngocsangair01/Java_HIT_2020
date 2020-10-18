package Bai4_PhongMay;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTenQL;

    public QuanLy() {
    }

    public QuanLy(String maQL, String hoTenQL) {
        this.maQL = maQL;
        this.hoTenQL = hoTenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTenQL() {
        return hoTenQL;
    }

    public void setHoTenQL(String hoTenQL) {
        this.hoTenQL = hoTenQL;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "maQL='" + maQL + '\'' +
                ", hoTenQL='" + hoTenQL + '\'' +
                '}';
    }
    public void InputQuanLy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma quan ly may: ");
        this.maQL = sc.nextLine();
        System.out.println("Moi nhap ho ten nguoi quan ly may: ");
        this.hoTenQL = sc.nextLine();
    }
}
