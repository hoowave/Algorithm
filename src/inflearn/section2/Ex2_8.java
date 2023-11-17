package inflearn.section2;

import java.util.Scanner;

public class Ex2_8 {

    public int[] solution(int[] m) {
        int[] answer = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            int cnt = 1;
            for (int j = 0; j < m.length; j++) {
                if (m[i] < m[j]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_8 T = new Ex2_8();
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
