package baekjoon.round2;

import java.util.Scanner;

public class Ex11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        arr = sort(arr);

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

    public static int[][] sort(int[][] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0] || arr[i][1] > arr[j][1]) {
                    temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                    temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
        return arr;
    }
}
