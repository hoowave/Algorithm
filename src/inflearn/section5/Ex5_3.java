package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

public class Ex5_3 {
    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][move - 1] != 0) {
                    int temp = board[i][move - 1];
                    board[i][move - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(temp);
                    break;
                }
            }
        }
        System.out.println(stack);
        return answer;
    }

    public static void main(String args[]) {
        Ex5_3 T = new Ex5_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, board, m, moves));
    }
}
