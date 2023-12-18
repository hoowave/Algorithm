package baekjoon.Training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    String name;
    int day;
    int month;
    int year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Student student) {
        if (this.year == student.year) {
            if (this.month == student.month) {
                return this.day - student.day;
            }
            return this.month - student.month;
        }
        return this.year - student.year;
    }

    public static Comparator<Student> Desc = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.year == s2.year) {
                if (s1.month == s2.month) {
                    return s2.day - s1.day;
                }
                return s2.month - s1.month;
            }
            return s2.year - s1.year;
        }
    };

}

public class Ex5635 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            list.add(new Student(name, day, month, year));
        }
        Collections.sort(list, Student.Desc);
        System.out.println(list.get(0).name);
        Collections.sort(list);
        System.out.println(list.get(0).name);
    }
}
