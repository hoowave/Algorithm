package baekjoon.round4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<Integer> nSet = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int mNum = Integer.parseInt(st.nextToken());
            if(nSet.contains(mNum)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
