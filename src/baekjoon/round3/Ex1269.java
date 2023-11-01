package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1269 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Integer> mapA = new LinkedHashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int rs = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int numA = Integer.parseInt(st.nextToken());
            mapA.put(numA, mapA.getOrDefault(numA, 0) + 1);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int numB = Integer.parseInt(st.nextToken());
            mapA.put(numB, mapA.getOrDefault(numB, 0) + 1);
        }
        for (int numA : mapA.keySet()) {
            if (mapA.get(numA) == 1) {
                rs++;
            }
        }
        System.out.println(rs);
    }
}
