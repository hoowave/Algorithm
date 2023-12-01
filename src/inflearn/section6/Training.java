package inflearn.section6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Training {
    public void ex4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (list.contains(num)) {
                list.remove(list.indexOf(num));
            }
            list.add(num);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(list.size() - 1 - i) + " ");
        }
    }

    public void ex5() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) flag = false;
        }
        if (flag) System.out.println("U");
        else System.out.println("D");
    }

    class Axis implements Comparable<Axis> {
        int x;
        int y;

        public Axis(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Axis axis) {
            if (this.x == axis.x) return this.y - axis.y;
            else return this.x - axis.x;
        }
    }

    public void ex6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Axis> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Axis(x, y));
        }
        Collections.sort(list);
        for (Axis axis : list) System.out.println(axis.x + " " + axis.y);
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex6();
    }
}
