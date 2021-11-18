package com.TMS.Lesson4;

import java.util.Arrays;
import java.lang.*;

public class Main {


    public static void main(String[] args) {
        //task1
        System.out.println(Task1_Seasons.summer.month);
        System.out.println(Task1_Seasons.winter.month);
        System.out.println(Task1_Seasons.valueOf("spring"));


        //task2
        int[] arr = {24, 9, 798, 38, 20, 78, 1, 43};
        Task2 t2 = new Task2(arr);
        t2.sort(arr);
        t2.max(arr);


    }

}
