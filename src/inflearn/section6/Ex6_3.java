package inflearn.section6;

import java.util.Scanner;

public class Ex6_3 {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String args[]) {
        Ex6_3 T = new Ex6_3();
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
