import java.util.Scanner;

public class Person {
    private String maSinhVien;
    private String hoTen;
    private String queQuan;
    // fn+ alt + insert
    public Person() {
    }

    public Person(String maSinhVien, String hoTen, String queQuan) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma sinh vien: ");
        this.maSinhVien = sc.nextLine();
        System.out.println("Moi nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi nhap que quan: ");
        this.queQuan = sc.nextLine();
    }
    public void Output() {
        System.out.println(hoTen +"\t"+maSinhVien+"\t" +queQuan);
    }
}
