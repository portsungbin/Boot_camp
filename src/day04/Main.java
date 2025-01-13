package day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Scanner 선택하여 입력기 생성
        Scanner scan = new Scanner(System.in);
        int result;
        int a = scan.nextInt();
        int b = scan.nextInt();

        result = a + 100;//
        System.out.print(result + " ");
        result = b % 10;
        System.out.println(result);
        //5. 출력포멧에 맞도록 출력


    }
}
