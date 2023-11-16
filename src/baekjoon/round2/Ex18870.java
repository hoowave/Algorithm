package baekjoon.round2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex18870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        int[] list = new int[num];
        int rank = 0;
        for (int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int[] sortList = list.clone();
        Arrays.sort(sortList);

        for (int i = 0; i < num; i++) {
            if (!map.containsKey(sortList[i])) {
                map.put(sortList[i], rank++);
            }
        }

        for (int i = 0; i < num; i++) {
            sb.append(map.get(list[i]) + " ");
        }
        System.out.println(sb);
    }
}
