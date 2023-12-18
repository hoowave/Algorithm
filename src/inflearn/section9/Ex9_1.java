package inflearn.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class P implements Comparable<P> {
    int a;
    int b;

    public P(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(P p) {
        return p.a - this.a;
    }
}

public class Ex9_1 {

    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<P> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new P(a, b));
        }
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        for (P p : list) {
            if (p.b > max) {
                max = p.b;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
