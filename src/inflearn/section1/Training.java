package inflearn.section1;

import java.util.Scanner;

public class Training {
    Scanner sc = new Scanner(System.in);

    public int ex1() {
        int answer = 0;
        String n = sc.next();
        String m = sc.next();
        n = n.toUpperCase();
        m = m.toUpperCase();
        for (char c : n.toCharArray()) {
            if (c == m.charAt(0)) {
                answer++;
            }
        }
        return answer;
    }

    public String ex2() {
        String answer = "";
        String n = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char c : n.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public String ex3() {
        String answer = "";
        String n = sc.nextLine();
        int min = Integer.MIN_VALUE;
        for (String s : n.split(" ")) {
            if (s.length() > min) {
                answer = s;
                min = s.length();
            }
        }
        return answer;
    }

    public void ex4() {
        int n = sc.nextInt();
        sc.nextLine();
        String[] m = new String[n];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextLine();
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length() - 1; j >= 0; j--) {
                System.out.print(m[i].charAt(j));
            }
            System.out.println();
        }
    }

    public String ex5() {
        String answer = "";
        String n = sc.next();
        char[] c = n.toCharArray();
        int lt = 0;
        int rt = n.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public String ex6() {
        String answer = "";
        String n = sc.next();
        for (int i = 0; i < n.length(); i++) {
            if (n.indexOf(n.charAt(i)) == i) {
                answer = answer + n.charAt(i);
            }
        }
        return answer;
    }

    public String ex7() {
        String answer = "";
        String n = sc.next();
        n = n.toUpperCase();
        String temp = new StringBuilder(n).reverse().toString();
        if (n.equals(temp)) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

    public String ex8() {
        String answer = "";
        String n = sc.nextLine();
        n = n.toUpperCase();
        n = n.replaceAll("[^A-Z]", "");
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) == n.charAt(n.length() - 1 - i)) {
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public int ex9() {
        int answer = 0;
        String n = sc.next();
        n = n.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(n);
        return answer;
    }

    public void ex10() {
        int[] answer;
        String s = sc.next();
        String t = sc.next();
        answer = new int[s.length()];
        int idx = 101;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                idx = 0;
            } else {
                idx++;
            }
            answer[i] = idx;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t.charAt(0)) {
                idx = 0;
            } else {
                idx++;
                answer[i] = Math.min(answer[i], idx);
            }

        }

        for (int n : answer) {
            System.out.print(n + " ");
        }
    }

    public String ex11() {
        String answer = "";
        String str = sc.next();
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public String ex12() {
        String answer = "";
        int n = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7);
            temp = temp.replace("#", "1").replace("*", "0");
            answer += (char)Integer.parseInt(temp,2);
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String args[]) {
        Training T = new Training();
        System.out.println(T.ex12());
    }
}
