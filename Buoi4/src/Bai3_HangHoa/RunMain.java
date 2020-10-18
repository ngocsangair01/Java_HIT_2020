package Bai3_HangHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Phieu> phieu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so phieu: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Nhap phieu thu "+i+": ");
            Phieu x = new Phieu();
            x.InputPhieu();
            phieu.add(x);
        }
        for(int i=0;i<n;i++) {
            System.out.println(phieu.get(i).toString());
        }
    }
}
