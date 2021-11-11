package com.TMS.Lesson3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {65, 86, 24, 987, 456, 9754, 12, 4345, 788, 96, 334};
        int min, max;
        min = max = arr[0];

        for (int i = 1; i < 10; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("--------------");
        System.out.println("min num of array: " + min);
        System.out.println("--------------");
        System.out.println("max num of array: " + max);
    }
}
