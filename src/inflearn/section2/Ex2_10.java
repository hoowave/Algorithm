package inflearn.section2;

import java.util.Scanner;

public class Ex2_10 {

    public int solution(int n, int[][] m) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (m[i][j] > m[i - 1][j]
                        && m[i][j] > m[i + 1][j]
                        && m[i][j] > m[i][j - 1]
                        && m[i][j] > m[i][j + 1]) answer++;
            }
        }
        return answer;
    }

    public int solution2(int n2, int[][] m2) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int answer = 0;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n2
                            && ny >= 0 && ny < n2
                            && m2[i][j] < m2[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_10 T = new Ex2_10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m));

        int n2 = sc.nextInt();
        int[][] m2 = new int[n2][n2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution2(n2, m2));
    }
}
