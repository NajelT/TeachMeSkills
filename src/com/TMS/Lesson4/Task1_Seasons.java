package com.TMS.Lesson4;

public enum Task1_Seasons {
    winter("December, January, February"),
    autumn("March, April, May"),
    summer("June, Juli, August"),
    spring("September, October, November");

    String month;

    Task1_Seasons(String month){
        this.month = month;
    }
}
