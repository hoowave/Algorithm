package inflearn.section7;

import java.util.Scanner;

public class Ex7_2 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String args[]) {
        Ex7_2 T = new Ex7_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
    }
}
