package IsPrime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int s = 0;
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int [] prime = Prime(n);
        for(int i=0;i< arr.length;i++){
            s += IsPrime(arr[i]) ? arr[i] +prime[i] -i : arr[i];
        }
        System.out.println(s);
    }
    public static boolean IsPrime (int n) {
        for(int i=2;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }

        }
        return n>1;
    }
    public static int [] Prime(int n) {
        int count = 0;
        int t=2;
        int[] prime = new int[n];
        while (count <n) {
            if(IsPrime(t)) {
                prime[count++] = t;
            }
            t++;
        }
        return prime;
    }
}
