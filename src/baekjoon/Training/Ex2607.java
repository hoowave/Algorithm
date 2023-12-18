package baekjoon.Training;

import java.util.Scanner;

public class Ex2607 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int[] baseArr = new int[26];
        int answer = 0;
        String base = sc.next();
        int len = base.length();
        for (int i = 0; i < base.length(); i++) {
            int idx = base.charAt(i) - 'A';
            baseArr[idx]++;
        }
        while (n-- > 0) {
            int[] tempArr = baseArr.clone();
            String temp = sc.next();
            int cnt = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (tempArr[temp.charAt(i) - 'A'] > 0) {
                    cnt++;
                    tempArr[temp.charAt(i) - 'A']--;
                }
            }
            if (len - 1 == temp.length() && cnt == temp.length()) { //길이가 한글자 작을 때
                answer++;
            } else if (len == temp.length()) { //길이가 같을 때
                if (cnt == len || cnt == len - 1) answer++;
            } else if (len + 1 == temp.length()) { //길이가 한글자 클 때
                if (cnt == len) answer++;
            }
        }
        System.out.println(answer);
    }
}
