package inflearn.section6;

import java.util.Scanner;

public class Ex6_2 {
    public int[] solution(int n, int[] arr) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Ex6_2 T = new Ex6_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int rs : T.solution(n, arr)) {
            System.out.print(rs + " ");
        }
    }
}
