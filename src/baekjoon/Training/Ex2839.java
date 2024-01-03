package baekjoon.Training;

import java.util.Scanner;

public class Ex2839 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 5 == 0) {
                answer += n / 5;
                break;
            }
            if (n < 3) {
                answer = -1;
                break;
            }
            n = n - 3;
            answer++;
        }
        System.out.println(answer);
    }
}
