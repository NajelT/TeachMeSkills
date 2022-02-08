package com.TMS.Lesson9;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private Gender gender;
    private int age;

    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && gender == user.gender && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }


    @Override
    public int compareTo(User o) {
        if(this.age == o.getAge()){
            String s = String.valueOf(o.name.charAt(0));
            return s.compareTo(String.valueOf(o.name.charAt(0)));
        }else if(this.age<o.age){
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
