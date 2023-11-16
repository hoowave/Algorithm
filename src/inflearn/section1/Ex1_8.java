package inflearn.section1;

import java.util.Scanner;

public class Ex1_8 {
    public String solution(String str) {
        String answer = "";
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        String regStr = str.replaceAll("[^A-Z]","");
        sb.append(regStr);
        if(regStr.equals(sb.reverse().toString())){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex1_8 T = new Ex1_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
