package com.TMS.Lesson5;

public abstract class Employee extends Person{
    public JOBROLE jobrole;
    int experience;
    int baseRate;

    public Employee(String name, String lastName, int experience, int baseRate){
        super(name, lastName);
        this.experience = experience;
        this.baseRate = baseRate;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return
                "name - " + name + " | Lastname - " + lastName;
    }

    public int salaryCounter(){
        int baseRate = this.baseRate;
        JOBROLE jobrole = this.jobrole;
        int experience = this.experience;
        int salary = baseRate*jobrole.coefficient*experience;
        return salary;
    }

    public void getInfo(){
        getNameAndLastName();
        int salary=salaryCounter();
        System.out.println("experience - " + this.getExperience() + " years. Salary - " + salary + "$");
    }

    public abstract void setJobRole();

}
