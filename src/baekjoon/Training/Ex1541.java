package baekjoon.Training;

import java.util.Scanner;

public class Ex1541 {
    public static void main(String[] args) {
        int answer = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("-");
        for(String rs : arr) {
            String[] temp = rs.split("\\+");
            int sum = 0;
            for(String rss : temp){
                sum += Integer.parseInt(rss);
            }
            if(answer == Integer.MAX_VALUE){
                answer = sum;
            }else{
                answer -= sum;
            }
        }
        System.out.print(answer);
    }
}
