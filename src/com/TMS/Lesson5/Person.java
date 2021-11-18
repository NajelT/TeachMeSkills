package com.TMS.Lesson5;

import java.sql.SQLOutput;

public class Person {
    String name;
    String lastname;

    public String getNameAndLastname(){
        System.out.println(name + " " + lastname);
        return name+lastname;
    }

}
