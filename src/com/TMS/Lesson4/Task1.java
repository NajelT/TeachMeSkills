package com.TMS.Lesson4;

public enum Task1 {
    Summer("June, Jul, August"),
    Spring("September, October, November"),
    Winter("December, January, February"),
    Autumn("March, April, May");

    String month;

    Task1(String month){
        this.month = month;
    }
}
