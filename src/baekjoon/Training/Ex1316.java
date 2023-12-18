package baekjoon.Training;

import java.util.Scanner;

public class Ex1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (chk(sc.next())) answer++;
        }
        System.out.println(answer);
    }

    public static boolean chk(String str) {
        int prev = 0;
        boolean[] flag = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i);
            if (prev != idx) {
                if (!flag[idx - 'a']) {
                    flag[idx - 'a'] = true;
                    prev = idx;
                } else return false;
            }
        }
        return true;
    }
}
