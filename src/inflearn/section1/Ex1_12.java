package inflearn.section1;

import java.util.Scanner;

public class Ex1_12 {
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7);
            temp = temp.replace("#", "1").replace("*", "0");
            str = str.substring(7);
            answer = answer + (char) Integer.parseInt(temp, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1_12 T = new Ex1_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
