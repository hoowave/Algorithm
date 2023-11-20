package inflearn.section2;

import java.util.Scanner;

public class Ex2_9 {

    public int solution(int n, int[][] m) {
        int answer = Integer.MIN_VALUE;
        int sum1;
        int sum2;
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += m[i][j];
                sum2 += m[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += m[i][i];
            sum2 += m[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String args[]) {
        Ex2_9 T = new Ex2_9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m));
    }
}
