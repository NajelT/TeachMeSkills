package com.TMS.Lesson4;

public enum Task3_users_enum {
    user1("alex","Anreenkov", 24, "man", "Estonia", "Tallinn"),
    user2("Georgi", "Prelovski", 24, "man", "Roma", "Beshkenbek"),
    user3("Leonardo", "Salamatin", 24, "man", "Antic greece", "Olymp");

    public Task3_users_enum setAge(int ageIncrease) {
        int result = age + ageIncrease;
        System.out.println(result);
        return null;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
@Deprecated
    public void getLastName() {
        System.out.println(lastName);
    }

    public void generalInfo(){
        System.out.println("name - "+ name+ "\n" + "lastName - " + lastName +"\n" + "age - " + age + "\n" + "sex - " + sex);
    }

    String name;
    String lastName;
    int age;
    String sex;
    String country;
    String city;


    Task3_users_enum(String name, String lastName, int age, String sex, String country, String city){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.country = country;
        this.city = city;
    }
}
