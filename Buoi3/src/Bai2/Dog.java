package Bai2;

import java.util.Scanner;

public class Dog {
    private String name;
    private int MP = 100;

    public Dog() {

    }


    public Dog(String name, int MP) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMP() {
        return MP;
    }

    public void InputName(String name) {
        System.out.println("Nhap ten can sua: ");
        this.setName(new Scanner(System.in).nextLine());
    }
    public void show () {
        System.out.println("So MP la: "+MP);
    }
    public void Bark() {
        if (name == "") {
            System.out.println("Chua dien ten ban ei!!!");
        }
        else {
            System.out.println("sủa đi " + name);
            this.MP = MP -20;
        }
    }
}

