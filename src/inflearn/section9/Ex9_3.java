package inflearn.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time t) {
        if (this.time == t.time) return this.state - t.state;
        else return this.time - t.time;
    }
}

public class Ex9_3 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList();
        for (int i = 0; i < (n * 2); i++) {
            int time = sc.nextInt();
            char state;
            if (i % 2 == 0) state = 's';
            else state = 'e';
            list.add(new Time(time, state));
        }
        Collections.sort(list);

        int cnt = 0;
        for (Time t : list) {
            if (t.state == 's') cnt++;
            if (t.state == 'e') cnt--;
            if (cnt > answer) answer = cnt;
        }
        System.out.println(answer);
    }
}
