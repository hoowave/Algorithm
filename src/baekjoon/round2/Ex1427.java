package baekjoon.round2;

import java.util.Scanner;

public class Ex1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = Character.getNumericValue(num.charAt(i));
        }

        arr = sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

    public static int[] sort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
