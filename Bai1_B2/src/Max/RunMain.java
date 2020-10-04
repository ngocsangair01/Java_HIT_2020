package Max;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		System.out.println("Nhap c: ");
		c = sc.nextInt();
		if (a>b&&a>c) {
			System.out.println("a la so lon nhat");
		}
		if (b>c&&b>a) {
			System.out.println("b la so lon nhat");
		}
		if(c>a&&c>b) {
			System.out.println("c la so lon nhat");
		}
	}
	
}
