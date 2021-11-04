package com.TMS.Lesson2.condition.switchCase;

public class SwitchCase {
    public static void main(String[] args) {
        int value = 10;

        switch (value){
            case 0:
                System.out.println("0");
                break;
            case 10:
                System.out.println("10");
                break;
            case 100:
                System.out.println("100");
                break;
            default:
                System.out.println("Default");
        }
    }
}
