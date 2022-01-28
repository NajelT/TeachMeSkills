package com.TMS.Lesson6;

public class Person {

    String name;
    String lastName;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void getNameAndLastName(){
        System.out.println("name is - " + name + " | lastName is - " + lastName);
    }

    public String getName() {
        return name;
    }
}
