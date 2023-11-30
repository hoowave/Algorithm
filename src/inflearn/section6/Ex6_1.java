package inflearn.section6;

import java.util.Scanner;

public class Ex6_1 {
    public int[] solution(int n, int[] arr) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Ex6_1 T = new Ex6_1();
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
