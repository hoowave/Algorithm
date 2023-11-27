package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

public class Ex5_1 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.empty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String args[]) {
        Ex5_1 T = new Ex5_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
