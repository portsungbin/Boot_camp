package day05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            System.out.print(a[i] + " ");
        }



    }
}
