package baekjoon.round4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long max = arr[n - 1];
        long min = 1;

        while (min <= max) {
            long mid = (min + max) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += (arr[i] / mid);
                System.out.println("arr[" + i + "] = " + arr[i] + " / mid = " + mid);
                System.out.println("(for)cnt = " + cnt);
            }
            System.out.println("cnt = " + cnt);
            if (cnt >= m) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
