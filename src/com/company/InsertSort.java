package com.company;

public class InsertSort {

    /**
     * 插入排序
     * 拿出无序部分的第一个元素array[current]，从有序的部分的最后一个元素开始向前找，找到他的位置并插入
     * i为有序队列的最后一个index，所以preIndex初始化为i,在寻找current的合适位置的过程中不断更新preIndex
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int preIndex = i;
            //以i为有序的最后一个元素 之后为无序
            int current = i + 1;
            while (preIndex >= 0 && array[current] < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex] = array[current];
        }
        return array;
    }

    /**
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,4,6,2,3,7,8,9,2,6,45,22,2};
        int b[] = insertionSort(a);
//        int b[] = sort(a);

        for (int i: b) {
            System.out.println(i);
        }

    }

}
