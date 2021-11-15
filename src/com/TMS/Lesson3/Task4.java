package com.TMS.Lesson3;

public class Task4 {
    public static void main(String[] args) {

//Не моё решение, пытался понять.

        int[] array = {6,4,5,7,4,3,2,6,5,3,2,6};

        int min;
        int count = 1;
        int maxCount = 1;
        int number = array[0];

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = array.length - 1; i > j; i--) {
                if (array[i] < array[i - 1]) {
                    min = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = min;
                }
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                if (count >= maxCount) {
                    maxCount = count;
                    number = array[i];
                }
                count = 1;
            }
        }

        if (count >= maxCount) {
            number = array[array.length - 1];
            maxCount = count;
        }

        System.out.printf("Число %s встречается %s раз", number, maxCount);


    }
}