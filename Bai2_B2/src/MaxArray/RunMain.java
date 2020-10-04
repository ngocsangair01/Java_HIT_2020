package MaxArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ptu mang n: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"]=");
			num = sc.nextInt();
			a.add(num);
		}
		int max = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i).compareTo(max)>0) {
				max = a.get(i);
			}
		}
		System.out.println("max la: "+max);
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
//		for (int  i = 0; i < a.size(); i++) {
//			for (int j = i+1; j < a.size(); j++) {
//				if(a.get(i)>a.get(j)) {
//					int tg = a.get(i);
//					a.get(i)=a.get(j);
//					a.get(j)=tg;
//				}
//			}
//		}
	}
}
