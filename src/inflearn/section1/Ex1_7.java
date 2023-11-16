package inflearn.section1;

import java.util.Scanner;

public class Ex1_7 {
    public String solution(String str) {
        String answer = "";
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                answer = "NO";
                break;
            }else{
                answer = "YES";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1_7 T = new Ex1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
