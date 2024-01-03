package baekjoon.Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    int p;
    int t;

    public Person(int p, int t) {
        this.p = p;
        this.t = t;
    }

    @Override
    public int compareTo(Person p) {
        return this.t - p.t;
    }
}

public class Ex11399 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            list.add(new Person(i, t));
        }
        Collections.sort(list);

        int temp = 0;
        for (Person p : list) {
            answer += temp + p.t;
            temp += p.t;
        }
        System.out.println(answer);
    }
}
/*
1 2 3 3 4
        1+2=3
        3+3=6
        6+3=9
        9+4=13
*/