package inflearn.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Training {
    public void ex1() {
        String answer = "YES";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != ')') stack.push(c);
            else {
                while (stack.pop() != '(') {
                }
            }
        }
        for (char c : stack) {
            answer += c;
        }
        System.out.println(answer);
    }

    public void ex3() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            move -= 1;
            int num = 0;
            for (int i = 0; i < n; i++) {
                if (board[i][move] != 0) {
                    num = board[i][move];
                    board[i][move] = 0;
                    if (!stack.isEmpty() && num == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(num);
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    public void ex4() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            int ln;
            int rn;
            if (Character.isDigit(c)) stack.push(Integer.parseInt(String.valueOf(c)));
            else {
                rn = Integer.parseInt(String.valueOf(stack.pop()));
                ln = Integer.parseInt(String.valueOf(stack.pop()));
                if (c == '+') stack.push(ln + rn);
                else if (c == '*') stack.push(ln * rn);
                else if (c == '-') stack.push(ln - rn);
                else if (c == '/') stack.push(ln / rn);
            }
        }
        answer = stack.pop();
        System.out.println(answer);
    }

    public void ex5() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));
            else {
                stack.pop();
                if (str.charAt(i) == ')' && str.charAt(i - 1) == '(') answer += stack.size();
                else {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }

    public void ex6() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() != 1) {
            for (int i = 1; i < m; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        answer = queue.poll();
        System.out.println(answer);
    }

    public void ex7() {
        Scanner sc = new Scanner(System.in);
        String answer = "YES";
        String n = sc.next();
        String m = sc.next();
        Queue<Character> queue = new LinkedList<>();
        for (char c : n.toCharArray()) {
            queue.offer(c);
        }
        for (char c : m.toCharArray()) {
            if (queue.contains(c) && c != queue.poll()) {
                answer = "NO";
                break;
            }
        }
        if (!queue.isEmpty()) answer = "NO";
        System.out.println(answer);
    }

    public class Person {
        int n;
        int m;

        public Person(int n, int m) {
            this.n = n;
            this.m = m;
        }
    }

    public void ex8() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, sc.nextInt()));
        }
        while (!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person p : queue) {
                if (p.m > temp.m) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (temp.n == k) System.out.println(answer);
            }
        }
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex8();
    }
}
