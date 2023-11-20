package inflearn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Training {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        int n = sc.nextInt();
        int[] m = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                list.add(m[i]);
            } else if (m[i] > m[i - 1]) {
                list.add(m[i]);
            }
        }
        for (int rs : list) {
            System.out.print(rs + " ");
        }
    }

    public void ex2() {
        int[] answer;
        int n = sc.nextInt();
        int[] m = new int[n];
        int min = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            if (m[i] > min) {
                min = m[i];
                list.add(m[i]);
            }
        }
        System.out.println(list.size());
    }

    public void ex3() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer[i] = "D";
            else if (a[i] == 1 && b[i] == 2) answer[i] = "B";
            else if (a[i] == 1 && b[i] == 3) answer[i] = "A";
            else if (a[i] == 2 && b[i] == 1) answer[i] = "A";
            else if (a[i] == 2 && b[i] == 3) answer[i] = "B";
            else if (a[i] == 3 && b[i] == 1) answer[i] = "B";
            else if (a[i] == 3 && b[i] == 2) answer[i] = "A";
        }
        for (String rs : answer) {
            System.out.println(rs);
        }

    }

    public void ex4() {
        int n = sc.nextInt();
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        for (int rs : answer) {
            System.out.print(rs + " ");
        }
    }

    public void ex5() {
        int n = sc.nextInt();
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < arr.length; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }

    public boolean ex6_1(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void ex6() {
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            temp = new StringBuilder(temp).reverse().toString();
            m[i] = Integer.parseInt(temp);
        }
        for (int rs : m) {
            if (ex6_1(rs)) {
                System.out.print(rs + " ");
            }
        }
    }

    public void ex7() {
        int answer = 0;
        int n = sc.nextInt();
        int[] m = new int[n];
        int score = 0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            if (m[i] == 1) {
                score++;
            } else {
                score = 0;
            }
            answer += score;
        }
        System.out.print(answer);
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex7();
    }
}
