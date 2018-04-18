package com.company;

public class SelectSort {
    /**
     * 快速排序
     *  将数组分为有序和无序的两部分 每次找出无序队列中最小的那个和第一个交换
     *  i为无序队列的第一个index，也就是每一次在无需队列中找出的最小元素的最终该放的位置
     *  最终产生一个递增的序列
     * @param a
     * @return
     */
    public static int[] sort(int[] a) {
        if (a.length == 0) return a;

        int l = a.length;
        for(int i = 0; i < l; i++) {
            int minIndex = i;
            for(int j = i + 1; j < l - 1; j++) {
                if (a[j] <= a[minIndex]) {
                    //每次内层排序就是置无序序列中的最小者为有序序列的末尾
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
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
