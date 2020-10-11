package BTVN;

import java.util.Scanner;

public class Bai5_ChuanHoa {
    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuoi: ");
        S = sc.nextLine();
        String result = "";
        S = S.trim();
        while (S.contains("  ")) {
            S = S.replace("  "," ");
//            S = S.replace();
        }
        String [] arrS = S.split(" ");
        for (int i=0; i<arrS.length;i++) {
            result +=Character.toUpperCase(arrS[i].charAt(0)) + arrS[i].substring(1);
            if(i<arrS.length -1) {
                result +=" ";
            }
        }
        System.out.println(result);
    }
}
