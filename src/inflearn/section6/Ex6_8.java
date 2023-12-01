package inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_8 {
    public int solution(int n, int[] arr, int m) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) return mid + 1;
            else if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex6_8 T = new Ex6_8();
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
