package inflearn.section1;

import java.util.Scanner;

public class Ex1_9 {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        Ex1_9 T = new Ex1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
