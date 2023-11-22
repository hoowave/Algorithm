package inflearn.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex4_3 {
    public ArrayList<Integer> solution(int n, int[] arr, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = m - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex4_3 T = new Ex4_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int rs : T.solution(n, arr, m)) {
            System.out.print(rs + " ");
        }
    }
}
