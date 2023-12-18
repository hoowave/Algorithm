package baekjoon.Training;

import java.util.Arrays;
import java.util.Scanner;

public class Training {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long lt = 1;
        long rt = arr[n - 1];
        while (lt <= rt) {
            long count = 0;
            long mid = (lt + rt) / 2;
            for (int i = 0; i < n; i++) {
                if(arr[i] > mid){
                    count += arr[i] - mid;
                }
            }
            System.out.println(lt + " " + mid + " " + rt + " " + count);
            if (count >= m) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        System.out.println(rt);
    }
}