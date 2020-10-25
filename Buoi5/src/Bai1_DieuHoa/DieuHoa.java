package Bai1_DieuHoa;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private String congSuat;
    private int giaBan;

    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap cong suat: ");
        this.congSuat = sc.nextLine();
        System.out.println("Moi nhap gia ban: ");
        this.giaBan = sc.nextInt();
    }
    public void Output(){
        super.Output();
        System.out.println("Cong suat la: "+congSuat);
        System.out.println("Gia ban la:"+giaBan);
    }
}
