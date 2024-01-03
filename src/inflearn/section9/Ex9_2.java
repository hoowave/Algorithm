package inflearn.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time92 implements Comparable<Time92> {
    int start;
    int end;

    public Time92(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time92 t) {
        if (this.end == t.end) return this.start - t.start;
        else return this.end - t.end;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time92> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Time92(start, end));
        }
        Collections.sort(list);

        int et = 0;
        for (Time92 t : list) {
            if (t.start >= et) {
                answer++;
                et = t.end;
            }
        }
        System.out.println(answer);
    }
}
