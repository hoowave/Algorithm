package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

public class Ex5_4 {
    public int solution(String s) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                rt = Integer.parseInt(String.valueOf(c));
                stack.push(rt);
            } else {
                rt = stack.pop();
                lt = stack.pop();
                if (c == '+') answer = lt + rt;
                else if (c == '-') answer = lt - rt;
                else if (c == '*') answer = lt * rt;
                else if (c == '/') answer = lt / rt;
                stack.push(answer);
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex5_4 T = new Ex5_4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(T.solution(s));
    }
}
