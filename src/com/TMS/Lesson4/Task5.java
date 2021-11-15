package com.TMS.Lesson4;

public class Task5 {
    public static void main(String[] args) {
        Task5 t5 = new Task5(4,23,65);

    }


    int a,b,c;


    public Task5(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void overLoaded(int a){

    }
    public void overLoaded(int a, int b){

    }
    public String overLoaded(int a, int b, int c){

        return null;
    }
}

