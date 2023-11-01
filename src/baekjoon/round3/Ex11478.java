package baekjoon.round3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Ex11478 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
