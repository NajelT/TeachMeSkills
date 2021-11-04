package com.TMS.Lesson2.condition.If;

public class Main {
    public static void main(String[] args) {
        int value = 120;

        if (value<10){
            System.out.println("Less than 10");
        } else if(value<100){
            System.out.println("Less than 100");
        } else if (value < 1000){
            System.out.println("Less than 1000");
        } else{
            System.out.println("Other case");
        }

    }
}
