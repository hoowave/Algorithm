package inflearn.section7;

import java.util.Scanner;

public class Training {

    public void DFS1(int n) {
        if (n == 0) return;
        else {
            DFS1(n - 1);
            System.out.print(n + " ");
        }
    }

    public void ex1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS1(n);
    }

    public void DFS2(int n) {
        if (n == 0) return;
        else {
            DFS2(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS2(n);
    }

    public int DFS3(int n) {
        if (n == 0) return 1;
        else {
            return n * DFS3(n - 1);
        }
    }

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DFS3(n));
    }

    public static int[] fibo;

    public int DFS4(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS4(n - 2) + DFS4(n - 1);
    }

    public void ex4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        DFS4(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex4();
    }
}
