package inflearn.section7;

import java.util.Scanner;

public class Ex7_3 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }

    public static void main(String args[]) {
        Ex7_3 T = new Ex7_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));
    }
}
