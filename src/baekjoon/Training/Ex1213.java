package baekjoon.Training;

import java.util.Scanner;

public class Ex1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = "";
        String answer = "I'm Sorry Hansoo";
        int[] arr = new int[26];
        int odd = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'A';
            arr[idx]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
                num = i;
            }
            if (odd >= 2) {
                return;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) temp += (char)(i + 'A');
        }
        if (odd == 1) temp += (char)(num + 'A');
        System.out.println(temp);
    }
}
