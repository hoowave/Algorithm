package baekjoon.Training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10828 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int rs;
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String[] str = temp.split(" ");
            if (str[0].equals("push")) {
                int val = Integer.parseInt(str[1]);
                stack.push(val);
            } else if (str[0].equals("pop")) {
                if (stack.isEmpty()) rs = -1;
                else rs = stack.pop();
                System.out.println(rs);
            } else if (str[0].equals("size")) {
                System.out.println(stack.size());
            } else if (str[0].equals("empty")) {
                if(stack.isEmpty()) rs = 1;
                else rs = 0;
                System.out.println(rs);
            } else if (str[0].equals("top")) {
                if (stack.isEmpty()) rs = -1;
                else rs = stack.get(stack.size()-1);
                System.out.println(rs);
            }
        }
    }
}