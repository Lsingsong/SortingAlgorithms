package BaiduTest.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    /**
     * 计算A(m,n)
     * @param m
     * @param n
     * @return
     */
    public static int getAmn(int m, int n) {
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            m = m * (m - 1);
            m--;
        }
        return tmp;
    }

    public static int getCmn(int m, int n) {
        int j = getAmn(n, n);
        int k = getAmn(m, n);
        return j / k;
    }

    public static int getNum() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;//国家数量
        int total = 0;
        try {
            String resultString = bufferedReader.readLine();
            n = Integer.parseInt(resultString);
            if (n == 1) return getAmn(5,5);
            for (int i = 0; i < n; i++) {
                total = getAmn(5,5) * (getAmn(5,2) * getCmn(2 * i + 1, 1) + getAmn(3,3) * 2 * i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return total % 1000000007;
    }

    public static void main(String[] args) {
        int num = getNum();
        System.out.println(num);
    }
}
