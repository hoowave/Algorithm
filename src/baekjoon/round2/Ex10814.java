package baekjoon.round2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Data[] data = new Data[num];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Data();
            data[i].age = sc.nextInt();
            data[i].name = sc.nextLine();
        }
        Arrays.sort(data, Comparator.comparingInt(data2 -> data2.age));
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].age + "" + data[i].name);
        }
    }

    public static class Data {
        public int age;
        public String name;
    }
}
