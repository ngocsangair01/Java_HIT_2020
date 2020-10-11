package bai2_b1;
import java.util.Arrays;
import java.util.Scanner;

	public class Bai2buoi1 {
	
    	public static void main(String[] args) {
	        int m,n;
	        System.out.println("Nhap m: ");
	        Scanner sc = new Scanner(System.in);
	        m =sc.nextInt();
	        System.out.println("Nhap n: ");
	        n=sc.nextInt();
	        for(int i = 0 ; i < m ; i++){
	            System.out.print("*");
	        }
	        for(int i = 1 ; i < n-1 ; i++){
	            System.out.print("\n*");
	            for(int j = 0 ; j < m - 2 ; j++){
	                System.out.print(" ");
	            }
	            System.out.print("*");
	        }
	        System.out.println();
	        for(int i = 0 ; i < m ; i++){
	            System.out.print("*");
	        }
	    }
	}

