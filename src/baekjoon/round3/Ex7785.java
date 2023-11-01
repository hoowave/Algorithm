package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<String, Boolean> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")){
                map.put(name, true);
            }else if(state.equals("leave")){
                map.put(name, false);
            }
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key)){
                list.add(key);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for (String key : list) {
            System.out.println(key);
        }
    }
}
