package Menu;

import java.util.ArrayList;
import java.util.Scanner;

//import javax.security.auth.x500.X500Principal;

public class RunMain {
//	int num;
	public static void main(String[] args) {
		ArrayList<Integer> x;
		x = new ArrayList<Integer>();
		int choose;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("======================Hello====================");
			System.out.println("Chon 0 de thoat chuong trinh");
			System.out.println("Chon 1:Nhap mang ");
			System.out.println("Chon 2:Hien thi mang vua chon ");
			System.out.println("Chon 3:Them 1 phan tu vao vi tri k ");
			System.out.println("Chon 4:Xoa 1 phan tu o vi tri k ");
			System.out.println("Chon 5:Dao nguoc mang ");
			System.out.println("Chon 6:Hien thi phan tu a[i] va cac so chia het cho a[i] ");
//			System.out.println("Chon 7:Thoat chuong trinh! ");
			System.out.println("Moi chon chuc nang:");
			choose = sc.nextInt();
			switch (choose) {
			case 0:
				System.out.println("=====Ban da thoat chuong trinh!!=====");
				return;
			case 1:
				System.out.println("============Ban da chon nhap mang========== ");
				nhap(x);
				break;
			case 2:
				System.out.println("==========Ban da chon hien thi mang==========");
				show(x);
				break;
			case 3:
				System.out.println("==========Ban da chon them 1 phan tu vao vi tri k==========");
				them(x, i, n);
				break;
			case 4:
				System.out.println("==========Ban da chon xao 1 phan tu o vi tri k");
				xoa(x, k);
				break;
			case 5:
				System.out.println("==========Ban da chon dao nguoc mang==========");
				shownguoc(x);
				break;
			case 6:
				System.out.println("Ban da chon hien thi a[i] va cac so chia het cho a[i]");
				cau6(x);
				break;
			default:
				System.out.println("Ban da chon sai, moi chon lai!!!");
				break;
			}
		}while (true);
	}
	public static void nhap(ArrayList<Integer> x) {
//		ArrayList<Integer> x ;
//		x = new ArrayList<Integer>();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap so phan tu mang: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"]=");
			num = sc.nextInt();
			x.add(num);
		}
	}
	
	public static void show(ArrayList<Integer>x) {
//		ArrayList<Integer> x ;
//		x = new ArrayList<Integer>();
//		int num;
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}	
	}
	public static void shownguoc(ArrayList<Integer> x) {
//		int n = x.size();
		for (int i = x.size()-1; i >=0; i--) {
			System.out.println( x.get(i));
		}
	}
	public static void xoa(ArrayList<Integer> x,int k) { //xoa phan tu thu k , Cau 4
        x.remove(k-1);
    }
	public static boolean them(ArrayList<Integer> x,int i,int n) { //them phan tu x vao vi tri n , Cau 3
        if (n > x.size()) {
            return false;
        }
        else {
            x.add(n-1, i);
            return true;
        }
    } 
    public static void cau6(ArrayList<Integer> x) { //Cau 6
        System.out.println(x.get(1));
        System.out.println("NHUNG SO CHIA HET CHO A[1]");
        for(int i=0;i<x.size();i++) {
            if (x.get(i)%x.get(1)==0) {
                System.out.println(x.get(i));
            }
        }
    }
}
