package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<String, String> map1 = new LinkedHashMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map1.put(Integer.toString(i + 1), name);
            map2.put(name,Integer.toString(i + 1));
        }
        for (int i = 0; i < m; i++) {
            String idx = br.readLine();
            if (map1.get(idx) == null) {
                list.add(map2.get(idx));
            } else {
                list.add(map1.get(idx));
            }
        }
        for(String rs : list){
            System.out.println(rs);
        }
    }
}
