package baekjoon.Training;

import java.util.Scanner;

public class Ex14490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] num = n.split(":");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int m = 2;
        while(m <num1 || m < num2){
            if (num1 % m != 0 || num2 % m != 0) {
                m++;
            } else {
                num1 = num1 / m;
                num2 = num2 / m;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        sb.append(":");
        sb.append(num2);
        System.out.println(sb);
    }
}
