package inflearn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_4 {
    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < t.length() - 1; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (sMap.equals(tMap)) answer++;
            sMap.replace(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
            if(sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex4_4 T = new Ex4_4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(T.solution(s, t));
    }
}
