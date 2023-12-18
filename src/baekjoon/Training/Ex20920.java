package baekjoon.Training;

import java.io.*;
import java.util.*;

public class Ex20920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() >= m) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int cnt1 = map.get(str1);
                int cnt2 = map.get(str2);
                if (cnt1 == cnt2) {
                    if (str1.length() == str2.length()) {
                        return str1.compareTo(str2);
                    }
                    return str2.length() - str1.length();
                }
                return cnt2 - cnt1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
