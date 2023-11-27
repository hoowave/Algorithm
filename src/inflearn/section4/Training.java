package inflearn.section4;

import java.util.*;

public class Training {
    Scanner sc = new Scanner(System.in);

    public void ex1() {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        String m = sc.next();
        for (char c : m.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > max) {
                answer = c;
                max = map.get(c);
            }
        }
        System.out.println(answer);
    }

    public void ex2() {
        String answer = "NO";
        String str1 = sc.next();
        String str2 = sc.next();
        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(i);
            str1Map.put(temp, str1Map.getOrDefault(temp, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char temp = str2.charAt(i);
            str2Map.put(temp, str2Map.getOrDefault(temp, 0) + 1);
        }
        if (str1Map.equals(str2Map)) answer = "YES";
        System.out.println(answer);
    }

    public void ex3() {
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;

        for (int rt = m - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            list.add(map.size());
            map.replace(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        for (int rs : list) System.out.print(rs + " ");
    }

    public void ex4() {
        int answer = 0;
        String str1 = sc.next();
        String str2 = sc.next();
        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            str1Map.put(str1.charAt(i), str1Map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            str2Map.put(str2.charAt(i), str2Map.getOrDefault(str2.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = str2.length() - 1; rt < str1.length(); rt++) {
            str1Map.put(str1.charAt(rt), str1Map.getOrDefault(str1.charAt(rt), 0) + 1);
            if (str1Map.equals(str2Map)) answer++;
            str1Map.replace(str1.charAt(lt), str1Map.get(str1.charAt(lt)) - 1);
            if (str1Map.get(str1.charAt(lt)) == 0) str1Map.remove(str1.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }

    public void ex5() {
        int answer = -1;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    treeSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt = 0;
        for(int rs : treeSet){
            cnt++;
            if(cnt == m) answer = rs;
        }
        System.out.println(answer);
    }

    public static void main(String args[]) {
        Training T = new Training();
        T.ex5();
    }
}
