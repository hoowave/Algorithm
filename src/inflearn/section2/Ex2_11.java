package inflearn.section2;

import java.util.Scanner;

public class Ex2_11 {

    public int solution(int n, int m[][]) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (m[i][k] == m[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Ex2_11 T = new Ex2_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m));
    }
}
