package baekjoon.Training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex4358 {
    public static void main(String[] args) throws Exception {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int arr[] = new int[4];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 0;
        int rt = m - 1;

        while (rt < n) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = lt; i <= rt; i++) {
                    map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            lt++;
            rt++;
            int[] mapArr = new int[4];
            for (Character key : map.keySet()) {
                if (key == 'A') mapArr[0]++;
                else if (key == 'C') mapArr[1]++;
                else if (key == 'G') mapArr[2]++;
                else if (key == 'T') mapArr[3]++;
            }
            boolean flag = true;
            for (int i = 0; i < 4; i++) {
                if (arr[i] != mapArr[i]) flag = false;
            }
            if (flag) answer++;
        }
        System.out.println(answer);
    }
}
