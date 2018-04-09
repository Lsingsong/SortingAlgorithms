package com.company;

public class BubbleSort {
    /**
     * 冒泡 外层控制循环 内层控制比较
     * @param a
     * @return
     */
    public static int[] sort(int[] a) {
        if (a.length == 0) return a;
        int l = a.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (a[j + 1] <= a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a [j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,4,6,2,3,7};
        int b[] = sort(a);
        for (int i: b) {
            System.out.println(i);
        }

    }
}
