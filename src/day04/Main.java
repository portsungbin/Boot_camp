package day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Scanner 선택하여 입력기 생성
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a == b ? 1 : 0);
        System.out.println(a != b ? 1 : 0);

    }
}
