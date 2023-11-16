package inflearn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_6 {

    public boolean chk(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int[] solution(int[] n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            String temp = String.valueOf(n[i]);
            temp = new StringBuilder(temp).reverse().toString();
            n[i] = Integer.parseInt(temp);
            if (chk(n[i])) {
                list.add(n[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_6 T = new Ex2_6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for (int rs : T.solution(m)) {
            System.out.print(rs + " ");
        }
    }
}
