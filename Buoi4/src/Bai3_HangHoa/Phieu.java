package Bai3_HangHoa;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang hang;

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang hang) {
        this.maPhieu = maPhieu;
        this.hang = hang;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }
    public void InputPhieu () {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Moi nhap ma phieu: ");
        this.maPhieu = sc.nextLine();
        System.out.println("Moi nhap thong tin hang hoa: ");
        hang = new Hang();
        hang.Input();
    }

    @Override
    public String toString() {
        return "Phieu{" +
                "maPhieu='" + maPhieu + '\'' +
                ", hang=" + hang +
                '}';
    }
}
