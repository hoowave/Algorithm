package inflearn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_2 {
    public String solution(String n, String m) {
        String answer = "YES";
        HashMap<Character, Integer> nMap = new HashMap<>();
        HashMap<Character, Integer> mMap = new HashMap<>();
        for (char c : n.toCharArray()) {
            nMap.put(c, nMap.getOrDefault(c, 0) + 1);
        }
        for (char c : m.toCharArray()) {
            mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }
        for (char c : nMap.keySet()) {
            if (nMap.get(c) != mMap.get(c)) {
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex4_2 T = new Ex4_2();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        System.out.print(T.solution(n, m));
    }
}
