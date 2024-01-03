package inflearn.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture l) {
        return l.day - this.day;
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Lecture> list = new ArrayList<>();
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            list.add(new Lecture(money, day));
            if (day > max) max = day;
        }
        Collections.sort(list);

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (list.get(j).day < i) break;
                pQ.offer(list.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        System.out.println(answer);
    }
}
