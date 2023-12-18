package baekjoon.Training;

import java.util.Scanner;

public class Ex1051 {
    static int[][] board;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = getRs(i, j, Math.min(n, m));
            }
        }
    }

    public static int getRs(int i, int j, int range) {
        for (int k = 0; k < range - 1; k++) {
            if (i - k > 0 && j - k > 0) {
            } else if (i - k > 0 && j + k < m) {
                System.out.println("1 : " + i + " " + j);
            } else if (i + k < n && j - k > 0) {
            } else if (i + k < n && j + k < m) {
            }
        }

        return 1;
    }
}