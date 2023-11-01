package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // list의 각 요소의 빈도를 계산합니다.
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(frequencyMap.getOrDefault(num, 0));
        }

        for (int listNum : list) {
            sb.append(listNum + " ");
        }

        System.out.println(sb);
    }
}

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> myCard = new LinkedHashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            myCard.put(num, 0);
        }

        for (int myNum : myCard.keySet()) {
            for (int listNum : list) {
                if (myNum == listNum) {
                    int val = myCard.get(myNum);
                    myCard.replace(myNum, ++val);
                }
            }
            sb.append(myCard.get(myNum) + " ");
        }

        System.out.println(sb);
 */