package com.TMS.Lesson5;

import java.util.Arrays;

public class Director extends Employee {
    private Employee [] countOfWorkers = null;


    public Director(String name, String lastName, int experience, int baseRate){
        super(name, lastName, experience, baseRate);
    }

    public void addWorker(Employee employee) {
        if(countOfWorkers ==null){
            countOfWorkers =new Employee[1];
            countOfWorkers[0]=employee;
        }else{
            countOfWorkers =Arrays.copyOf(countOfWorkers, countOfWorkers.length+1);
            countOfWorkers[countOfWorkers.length-1]=employee;
        }
        System.out.println("Added worker: " + employee.toString());
    }

    public void getSubordinatesInfo(){
        System.out.println("Workers under " + name + " supervision: ");
        for (Employee employee : countOfWorkers) {
            employee.getInfo();
        }
    }

    @Override
    public int salaryCounter() {
        int salary = getExperience() * getBaseRate() * JOBROLE.DIRECTOR.coefficient * countOfWorkers.length+1;
        return salary;
    }

    @Override
    public void setJobRole() {
        jobrole = JOBROLE.DIRECTOR;
        System.out.println("JobRole is - " + jobrole);
    }

    @Override
    public void getInfo() {
        setJobRole();
        getNameAndLastName();
        System.out.println("Experience - " + this.getExperience() + " years. Salary - " + salaryCounter() + "$");
    }
}
