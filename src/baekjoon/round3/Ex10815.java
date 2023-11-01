package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ex10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> myCard = new LinkedHashMap<>();
        List<Integer> cmpCard = new ArrayList<>();
        int myNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < myNum; i++) {
            int card = Integer.parseInt(st.nextToken());
            myCard.put(card, myCard.getOrDefault(card,0)+1);
        }
        int cmpNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cmpNum; i++) {
            cmpCard.add(Integer.parseInt(st.nextToken()));
        }

        for (int key : cmpCard) {
            sb.append(myCard.getOrDefault(key, 0)).append(" ");
        }
        System.out.println(sb);
        /*
        for (int i = 0; i < cmpNum; i++) {
            cmpCard.put(Integer.parseInt(st.nextToken()), 0);
        }

        for (int key : cmpCard.keySet()) {
            for (int i = 0; i < myCard.size(); i++) {
                int cmpValue = cmpCard.get(key);
                if(myCard.get(i) == key){
                    cmpCard.replace(key, ++cmpValue);
                }
            }
            sb.append(cmpCard.get(key) + " ");
        }
        System.out.println(sb);
         */
    }
}
