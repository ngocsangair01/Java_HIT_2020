package Bai1_DieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so phan tu mang: ");
        n=sc.nextInt();
        ArrayList<DieuHoa> dieuHoa = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap thong tin san pham thu " +i);
            DieuHoa x = new DieuHoa();
            x.Input();
            dieuHoa.add(x);

        }
        for (int i=0;i<n;i++) {
            dieuHoa.get(i).Output();
        }
    }
}
