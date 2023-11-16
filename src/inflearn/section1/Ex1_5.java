package inflearn.section1;

import java.util.Scanner;

public class Ex1_5 {
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }

        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Ex1_5 T = new Ex1_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
