package com.TMS.Lesson5;

public enum JOBROLE {
    DIRECTOR(2),
    WORKER(1);

    int coefficient;

    JOBROLE(int coefficient){
        this.coefficient = coefficient;
    }


}
