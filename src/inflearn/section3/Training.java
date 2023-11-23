package inflearn.section3;

import java.util.Scanner;

public class Training {
    Scanner sc = new Scanner(System.in);

    public void ex3() {
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            if (sum > max) max = sum;
            answer = Math.max(max, answer);
        }
        System.out.println(answer);
    }

    public void ex4() {
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int sum = 0;
        int lt = 0;
        int rt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (rt < n) {
            sum += arr[rt];
            while (sum > m) {
                sum -= arr[lt];
                lt++;
            }
            if (sum == m) answer++;
            rt++;
        }
        System.out.println(answer);
    }

    public void ex6() {
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int cnt = 0;
        int lt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > m) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer=Math.max(answer,rt-lt+1);
        }
        System.out.println(answer);
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex6();
    }
}
