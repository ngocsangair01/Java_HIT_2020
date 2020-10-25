package Bai4_QuanLySinhVien;

import java.util.Scanner;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private String address;
    private int gpa;

    public SinhVien() {
    }

    public SinhVien(String id, String name, int age, String address, int gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma sinh vien: ");
        this.id = sc.nextLine();
        System.out.println("Moi nhap ho va ten sinh vien: ");
        this.name = sc.nextLine();
        System.out.println("Moi nhap tuoi sinh vien: ");
        this.age = sc.nextInt();
        System.out.println("Moi nhap dia chi cua sinh vien: ");
        this.address = sc.nextLine();
        System.out.println("Moi nhap diem trung binh cua sinh vien: ");
        this.gpa = sc.nextInt();
    }
    public void Show()  {
        SinhVien x = new SinhVien();
        System.out.println(x.toString());
    }
}
