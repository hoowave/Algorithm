package baekjoon.Training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

class File implements Comparable<File> {
    String str;
    int num;

    public File(String str, int num) {
        this.str = str;
        this.num = num;
    }

    @Override
    public int compareTo(File file) {
        return this.str.compareTo(file.str);
    }


}

public class Ex20291 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String[] temp = st.nextToken().split("\\.");
            map.put(temp[1], map.getOrDefault(temp[1], 0) + 1);
        }
        ArrayList<File> list = new ArrayList<>();
        for (String s : map.keySet()) {
            list.add(new File(s, map.get(s)));
        }
        Collections.sort(list);
        for (File rs : list) {
            System.out.println(rs.str + " " + rs.num);
        }
    }
}
