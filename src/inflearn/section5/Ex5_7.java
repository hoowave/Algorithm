package inflearn.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex5_7 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char c : need.toCharArray()) {
            Q.offer(c);
        }
        for (char c : plan.toCharArray()) {
            if (Q.contains(c) && c != Q.poll()) return "NO";
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String args[]) {
        Ex5_7 T = new Ex5_7();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(T.solution(a, b));
    }
}
