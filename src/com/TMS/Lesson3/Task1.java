package com.TMS.Lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
            int[] fib = new int[10];
            fib(fib);
            System.out.println(Arrays.toString(fib));
    }

    static void fib(int[] fib0){
        fib0[0] = 1;
        fib0[1] = 1;
        for (int i = 2; i < fib0.length; i++) {
            fib0[i]= fib0[i-1] + fib0[i-2];
        }
    }
}


