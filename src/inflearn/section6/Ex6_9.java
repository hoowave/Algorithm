package inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_9 {

    public int count(int[] arr, int m) {
        int cnt = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > m) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    public int solution(int n, int[] arr, int m) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex6_9 T = new Ex6_9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr, m));
    }
}
