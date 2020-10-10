package Bai4;

import java.util.Scanner;

public class Array {

    private int []array;
    private int n;

    public Array() {
    }

    public Array(int []array, int n) {
        this.array = array;
        this.n = n;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void InputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMoi nhap so phan tu mang: ");
        n = scanner.nextInt();
        array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }
    }
    public void Show() {
        for (int i=0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
    }
    public int Sum() {
        int S = 0;
        for (int i=0;i<n;i++) {
            S += array[i];
        }
        System.out.println("Tong la: "+S);
        return S;
    }
}
