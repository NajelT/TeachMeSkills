package com.TMS.Lesson6;

public class Worker extends Employee {

    public Worker(String name, String lastName, int experience, int baseRate) {
        super(name, lastName, experience, baseRate);
    }

    @Override
    public void setJobRole() {
        jobrole = JOBROLE.WORKER;
        System.out.println("JobRole is - " + jobrole);
    }

    @Override
    public void getInfo() {
        setJobRole();
        getNameAndLastName();
        System.out.println("Experience - " + this.getExperience() + " years. Salary - " + salaryCounter() + "$");
    }



}
