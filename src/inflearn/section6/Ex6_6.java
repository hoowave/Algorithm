package inflearn.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_6 {
    public String solution(int n, int[] arr) {
        String answer = "";
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                answer += (i+1) + " ";
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex6_6 T = new Ex6_6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
