package inflearn.section3;

import java.util.Scanner;

public class Ex3_3 {
    public int solution(int m, int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < m; i++) sum += arr[i];
        answer = sum;
        for (int i = m; i < arr.length; i++) {
            sum = sum + (arr[i] - arr[i - m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex3_3 T = new Ex3_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(m, arr));
    }
}
