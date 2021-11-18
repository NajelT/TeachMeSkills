package com.TMS.Lesson5;

public enum EMPLOYEE_ENUM{
    DIRECTOR(3),
    WORKER(2);
    int coef;

    EMPLOYEE_ENUM(int coef){
        this.coef = coef;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        coef = coef;
    }

}