package com.TMS.Lesson4;
import java.lang.reflect.*;
import java.util.Arrays;

class Task2 {
    int [] arr;

    Task2(int[] arr){
        this.arr = arr;
    }

    Task2 sort(int[] arr){
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }


    Task2 max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max is - " + max);
        return null;
    }

    
}
