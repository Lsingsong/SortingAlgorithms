package BaiduTest.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    int m = 0;
    int n = 0;
    int[][] matrix;

    public Main(int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new int[m][n];

    }
    /**
     * 获取下一步的位置
     * @param i
     * @param j
     * @return
     */
    public int getNext(int i, int j) {
        int height = matrix[i][j];
        if (i <= 0 || i > m || j <=0 || j > n) return height;
        height = Math.max(height, getNext(--i, ++j));
        height = Math.max(height, getNext(++i, ++j));
        height = Math.max(height, getNext(--i, --j));
        height = Math.max(height, getNext(++i, --j));
        return height;
    }

    /**
     * 获取输入
     * @return
     * @throws IOException
     */
    public int[] getInput() throws IOException {
        int[] ii = new int[200];
        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String[] str1 = one.split(" ");
        ii[0] = Integer.parseInt(str1[0]);//m
        ii[1] = Integer.parseInt(str1[1]);//n

        String two = scanner.next();
        String[] str2 = one.split(" ");
        ii[2] = Integer.parseInt(str1[2]);//sx
        ii[3] = Integer.parseInt(str1[3]);//sy

        for (int i = 0; i < ii[0]; i++) {
            for (int j = 0; j < ii[1]; j++) {
                Scanner scanner2 = new Scanner(System.in);
            }
        }

        return ii;
    }
}
