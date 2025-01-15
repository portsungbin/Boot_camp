package day06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int sum1 = 0;  // 짝수 번째 인덱스 합
        int sum2 = 0;  // 홀수 번째 인덱스 합
        int count = 0; // 홀수 번째 인덱스의 개수

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();

            if (i % 2 == 0) {
                sum1 += a[i];  // 짝수 번째 인덱스 값은 sum1에 합산
            } else {
                sum2 += a[i];  // 홀수 번째 인덱스 값은 sum2에 합산
                count++;        // 홀수 번째 인덱스의 개수 증가
            }
        }

        // 홀수 번째 값들의 평균 계산 (count가 0일 경우 방어 코드 추가)
        double avg = (double) sum2 / count;

        System.out.println("sum : " + sum2);  // 홀수 번째 값들의 합 출력
        System.out.printf("avg : %.1f", avg);  // 홀수 번째 값들의 평균 출력
    }
}