package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> nList = new LinkedHashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            nList.put(str, 0);
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for(String key : nList.keySet()){
                if(key.equals(str)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
