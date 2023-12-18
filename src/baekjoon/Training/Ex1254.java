package baekjoon.Training;

import java.util.Scanner;

public class Ex1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (!chk(str.substring(i))) answer++;
            else break;
        }
        System.out.println(answer);
    }

    public static boolean chk(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        while (lt <= rt) {
            if (str.charAt(lt) != str.charAt(rt)) return false;
            lt++;
            rt--;
        }
        return true;
    }
}

//abdfhdyrbdb
//sdfghjkllkjhgfds