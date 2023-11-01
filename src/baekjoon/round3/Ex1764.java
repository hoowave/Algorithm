package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.get(str) > 1) {
                list.add(str);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String rs : list){
            System.out.println(rs);
        }


    }
}
