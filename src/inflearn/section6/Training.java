package inflearn.section6;


import java.util.ArrayList;
import java.util.Scanner;

public class Training {
    public void ex1() {
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

    public static void main(String args[]) {
        Training T = new Training();
        T.ex1();
    }
}
