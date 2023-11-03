package baekjoon.round4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        long max = arr[n - 1];
        long min = 0;

        while (min <= max) {
            long mid = (min + max) / 2;
            long sum = 0;
            for (int tree : arr) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }
            if (sum >= m) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
