package com.TMS.Lesson3;

public class Task3 {
    public static void main(String[] args) {
        int[]arr = {2,5,9,4,7,2,65,5,7,120,34};
        int sumOfEven=0;
        int sumOfOdd=0;


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2  == 0) {
                    sumOfEven += arr[i];
                } else {
                    sumOfOdd += arr[i];
                }
            }
        System.out.println("diff between sum of even and odd nums - " + (sumOfEven-sumOfOdd));



    }
}
