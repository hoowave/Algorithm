package inflearn.section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex4_5 {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int rs : tSet) {
            cnt++;
            if (cnt == k) return rs;
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex4_5 T = new Ex4_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
