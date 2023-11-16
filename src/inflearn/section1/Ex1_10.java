package inflearn.section1;

import java.util.Scanner;

public class Ex1_10 {
    public int[] solution(String str, String t) {
        int[] answer = new int[str.length()];
        int idx = 101;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t.charAt(0)) {
                idx = 0;
            } else {
                idx++;
            }
            answer[i] = idx;
        }

        idx = 101;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t.charAt(0)) {
                idx = 0;
            } else {
                idx++;
                answer[i] = Math.min(answer[i], idx);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1_10 T = new Ex1_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = sc.next();
        for (int n : T.solution(str, t)) {
            System.out.print(n + " ");
        }
    }
}
