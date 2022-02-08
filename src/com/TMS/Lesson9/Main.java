package com.TMS.Lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>(List.of(
                new User("Ilja", Gender.MAN, 25),
                new User("Ljuda", Gender.WOMAN, 79),
                new User("Anton", Gender.MAN, 28),
                new User("Alegra", Gender.WOMAN, 55),
                new User("Anatolij", Gender.MAN, 21),
                new User("Pawka", Gender.MAN, 19)));



        Set <User> set = new TreeSet<>(Set.of(
                new User("Ilja", Gender.MAN, 29),
                new User("Valerka", Gender.MAN, 21),
                new User("Valerija", Gender.WOMAN, 52),
                new User("Valeron", Gender.MAN, 59),
                new User("Valergen", Gender.WOMAN, 106)));

        Service service = new ServiceImpl();

        System.out.println(service.findByGender(set, Gender.MAN));
        System.out.println(service.findByName(list, "Ilja"));
        System.out.println(service.sortByAge(list));

    }
}
