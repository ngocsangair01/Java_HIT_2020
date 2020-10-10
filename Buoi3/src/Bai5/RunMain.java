package Bai5;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Guns a = new Guns("M416",120);
        Guns b = new Guns("m762",150);
        while (a>0&&b>0) {
            a.Shoot(50);
            b.Shoot(150);
        }
        if(a.getAmmoNumber()==0) {
            System.out.println("Nguoi choi cam m416 da thua");
        }
        if(b.getAmmoNumber()==0) {
            System.out.println("Nguoi choi cam m762 da thua");
        }

    }
}
