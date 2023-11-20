package inflearn.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3_1 {

    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String args[]) {
        Ex3_1 T = new Ex3_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int rs : T.solution(arr1, arr2)) {
            System.out.print(rs + " ");
        }
    }
}
