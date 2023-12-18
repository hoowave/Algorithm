package baekjoon.Training;

import java.util.Scanner;

public class Ex5525 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        String tmp = "I";
        for (int i = 0; i < n; i++) {
            tmp += "OI";
        }
        int lt = 0;
        int rt = tmp.length();
        while (rt <= m) {
            if (tmp.equals(str.substring(lt, rt))) answer++;
            lt++;
            rt++;
        }
        System.out.println(answer);
    }
}
