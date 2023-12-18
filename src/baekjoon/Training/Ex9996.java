package baekjoon.Training;

import java.util.Scanner;

public class Ex9996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String start = "";
        String end = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (flag) {
                if (c == '*') {
                    flag = false;
                    continue;
                }
                start += str.charAt(i);
            } else {
                end += str.charAt(i);
            }
        }
        for (String s : arr) {
            if (start.length() + end.length() > s.length()) {
                System.out.println("NE");
                continue;
            }
            boolean rsFlag = true;
            for (int i = 0; i < start.length(); i++) {
                if (s.charAt(i) != start.charAt(i)) {
                    rsFlag = false;
                    break;
                }
            }
            for (int i = 0; i < end.length(); i++) {
                if (s.charAt(s.length() - end.length() + i) != end.charAt(i)) {
                    rsFlag = false;
                    break;
                }
            }
            if (rsFlag) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
