package inflearn.section4;

import java.util.HashMap;
import java.util.Scanner;

public class Training {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        String m = sc.next();
        for (char c : m.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > max) {
                answer = c;
                max = map.get(c);
            }
        }
        System.out.println(answer);

    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex1();
    }
}
