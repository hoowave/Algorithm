package inflearn.section1;

import java.util.Scanner;

public class Ex1_6 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer = answer + str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1_6 T = new Ex1_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
