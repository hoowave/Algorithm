package inflearn.section2;

import java.util.Scanner;

public class Ex2_1 {
    public String solution(int[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                answer = answer + String.valueOf(arr[i]) + " ";
            } else if (arr[i] > arr[i - 1]) {
                answer = answer + String.valueOf(arr[i]) + " ";
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_1 T = new Ex2_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
