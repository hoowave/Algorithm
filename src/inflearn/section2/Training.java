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

    public static void main(String args[]) {
        Training T = new Training();
        T.ex3();
    }
}
