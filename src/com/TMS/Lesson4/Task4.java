package com.TMS.Lesson4;

public class Task4 {
    int a,b,c;

    Task4(int a){
        this.a = a;
    }

    Task4(int a, int b){
        this(a,b,0);
    }

    Task4(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Task4 t4 = new Task4(3,5);
}
