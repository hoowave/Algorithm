package baekjoon.Training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex11047 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        while (k > 0) {
            for (int a : arr) {
                if (k / a != 0) {
                    answer += k / a;
                    k = k % a;
                }
            }
        }
        System.out.println(answer);
    }
}
