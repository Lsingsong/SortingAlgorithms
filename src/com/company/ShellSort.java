package com.company;

public class ShellSort {
    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,4,6,2,3,7};
        int b[] = shellSort(a);
        for (int i: b) {
            System.out.println(i);
        }
    }
}
