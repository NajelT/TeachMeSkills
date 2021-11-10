package com.TMS.Lesson2.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1: ");
        Scanner scr = new Scanner(System.in);
        String userWord = scr.next();

        if(userWord.equals("a")  || userWord.equals("e")){
            System.out.println("ваша буква гласная");
        }else if(userWord.equals("b") || userWord.equals("c")){
            System.out.println("Ваша буква согласная");
        }else{
            System.out.println("вы ввели не подходящую букву");
        }

        System.out.println("tap your word");
        Scanner sc = new Scanner(System.in);
        String userWords = scr.next();

        switch(userWords){
            case "a":
                if(userWord.equals("a"));
                System.out.println("your word is vowel");
                break;
            case "e":
                if (userWord.equals("e")) {
                    System.out.println("your word is vowel");
                }
                break;
            case "b":
                if (userWord.equals("b")) {
                    System.out.println("your word is consonant");
                }
                break;

            case "c":
                if (userWord.equals("c")) {
                    System.out.println("your word is consonant");
                }
                break;
        }


        //task 2
        System.out.println("Task 2: ");
        System.out.println("please, write some month: ");
        Scanner request = new Scanner(System.in);
        String month = request.next();

        switch (month){
            case "june", "juli", "August":
                System.out.println("this is summer");
                break;
            case "September", "November", "October":
                System.out.println("this is autumn");
                break;
            case "December", "January", "February":
                System.out.println("this is winter and it is close");
                break;
            case "March", "April", "May":
                System.out.println("this is Spring");
                break;
            default:
                System.out.println("It was incorrect writing");
        }


        //Task 3
        System.out.println("Task 3: ");
        System.out.print("hello, write something - ");
        Scanner word = new Scanner(System.in);
        String userAnswer = word.next();
        System.out.println("you wrote - " + userWord);

        while(!"exit".equals(userWord)){
            System.out.print("please, tap new word here - ");
            userWord = word.next();
            System.out.println("You wrote - " + userWord);
            if(userWord.equals("exit")) {
                System.out.print("exit from programm");
            }
        }

        //Task 4
        System.out.println("Task 4: ");
        Scanner ask = new Scanner(System.in);

        int a = ask.nextInt();
        int b = ask.nextInt();
        int sum = 0;

        for (int i = a; i < b; i++) {
            if (i%3==0){
                System.out.println(i);
              sum+=i;
            }
            }
        System.out.println(sum);

        //task 5
        System.out.println("Task 5: ");
        int[] arr = {4, 2, 5, 6, 7, 23, 45, 94, 76245, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest num is " + max);
        System.out.println("Smallest num is " + min);

        //task 6
        System.out.println("Task 6: ");
        int[] arra = {54,90,11,34,5,43,23,789,65,1213,56,70,33,1242};

        for (int j = 0; j < arr.length; j++) {
            for(int i = 0 ; i < arr.length - 1 ; i++){
                int el = arr[i];
                if(el > arr[i+1]){
                    int left = el;
                    int right = arr[i+1];
                    arr[i] = right;
                    arr[i+1] = left;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
