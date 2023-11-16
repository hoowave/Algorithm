package inflearn.section2;

import java.util.Scanner;

public class Ex2_7 {

    public int solution(int[] m) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }

        }
        return answer;
    }

    public static void main(String args[]) {
        Ex2_7 T = new Ex2_7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.println(T.solution(m));
    }
}
