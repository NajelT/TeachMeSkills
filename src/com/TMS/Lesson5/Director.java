package com.TMS.Lesson5;

public class Director extends Employee {
    int countOfWorkers;

    EMPLOYEE_ENUM director = EMPLOYEE_ENUM.DIRECTOR;

    @Override
    public void setEmployeeJobTitle(){


}
    public EMPLOYEE_ENUM addWorker(EMPLOYEE_ENUM employee_enum){
        EMPLOYEE_ENUM WorkerUnderControl = EMPLOYEE_ENUM.valueOf("DIRECTOR");
        return employee_enum;
        }


    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    @Override
    public int salaryCounterForDir(int experience, int dirCoef, int baseRate){

        this.experience = experience;
        this.dirCoef = dirCoef;
        this.baseRate = baseRate;
        int result = experience*dirCoef*baseRate*countOfWorkers;
        return result;
    }

}

