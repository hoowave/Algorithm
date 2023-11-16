package inflearn.section2;

import java.util.Scanner;

public class Ex2_2 {
    public int solution(int[] arr) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_2 T = new Ex2_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
