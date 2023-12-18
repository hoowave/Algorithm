package inflearn.section7;

import java.util.Scanner;

public class Ex7_1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n+ " ");
        }

    }

    public static void main(String args[]) {
        Ex7_1 T = new Ex7_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
    }
}
