package baekjoon.Training;

public class Ex4673 {
    public static void main(String[] args) {
        boolean[] flag = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int n = chk(i);
            if (n < 10001) flag[n] = true;
        }
        for (int i = 1; i < 10001; i++) {
            if (!flag[i]) System.out.println(i);
        }
    }

    public static int chk(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
