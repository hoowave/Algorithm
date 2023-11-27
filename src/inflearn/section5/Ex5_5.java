package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

public class Ex5_5 {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (s.charAt(i) == ')' && s.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex5_5 T = new Ex5_5();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));
    }
}
