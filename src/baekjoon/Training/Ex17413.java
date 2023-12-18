package baekjoon.Training;

import java.util.Scanner;
import java.util.Stack;

public class Ex17413 {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for (char c : str.toCharArray()) {
            if (c == '<') {
                while (!stack.isEmpty()) answer += stack.pop();
                flag = true;
            } else if (c == '>') {
                answer += c;
                flag = false;
                continue;
            }
            if (flag) answer += c;
            else {
                if (c == ' ') {
                    while (!stack.isEmpty()) answer += stack.pop();
                    answer += " ";
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()) answer += stack.pop();
        System.out.println(answer);
    }
}
