package baekjoon.round4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 6, 1, 7, 2, 3, 9, 4, 8, 11, 5, 10};
        int num = 7;

        System.out.println("-----정렬 전 배열-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.println("-----정렬 후 배열-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int idx = BinarySearch(arr, num);

        System.out.println(num + "의 index : " + idx);
    }

    public static int BinarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
