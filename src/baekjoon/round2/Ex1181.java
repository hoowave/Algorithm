package baekjoon.round2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int num = sc.nextInt();
        sc.nextLine();
        String temp = "";
        for (int i = 0; i < num; i++) {
            list.add(sc.nextLine());
        }
        // 길이와 사전 순으로 정렬
        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            } else {
                return a.compareTo(b);
            }
        });

        // 중복 제거 (순서 유지)
        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int num = sc.nextInt();
        sc.nextLine();
        String temp = "";
        for (int i = 0; i < num; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    */

    }
}
