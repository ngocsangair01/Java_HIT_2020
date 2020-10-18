package Bai4_PhongMay;

import Bai3_HangHoa.Phieu;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList <PhongMay> phongMay = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Moi nhap so may: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Moi nhap thong tin phong may thu " +i);
            PhongMay x = new PhongMay();
            x.InputPhongMay();
            phongMay.add(x);
        }
        for(int i=0;i<n;i++) {
            System.out.println(phongMay.get(i).toString());
        }
    }
}
