package baekjoon.round1;

import java.util.Scanner;

public class Ex2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tempA = (b/100);
        int tempB = (b-(tempA*100))/10;
        int tempC = b-((tempA*100)+(tempB*10));

        System.out.println(a*tempC);
        System.out.println(a*tempB);
        System.out.println(a*tempA);
        System.out.println(a*b);
    }
}
