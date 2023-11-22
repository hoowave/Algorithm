package inflearn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_1 {
    public char solution(int n, String m) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : m.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char c : map.keySet()) {
            if(map.get(c) > max){
                max = map.get(c);
                answer = c;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex4_1 T = new Ex4_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        System.out.print(T.solution(n, m));
    }
}
