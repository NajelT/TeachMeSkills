package com.TMS.Lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Family family1 = new Family("Lushpajevs", true, 8000, Arrays.asList(
                new Child("2Tolja", 10, true),
                new Child("Adel", 12, false),
                new Child("Marek", 1, true),
                new Child("Chanel", 7, false),
                new Child("Maks", 8, true)));

        Family family2 = new Family("Markovichs", false, 18000, Arrays.asList(
                new Child("2Makron", 3, true),
                new Child("Glandish", 9, false),
                new Child("Marek", 1, true)));

        Family family3 = new Family("Gudajevs", true, 4000, Arrays.asList(
                new Child("Hloja", 18, false),
                new Child("2Adel", 12, false),
                new Child("Herasima", 17, false),
                new Child("Koko", 5, true)));


        List<Family> families = Arrays.asList(family1, family2, family3);

        families.stream()
                .filter(family -> family.getSalary() > 3000)
                .filter(family -> family.getChildren().size() > 4)
                .forEach(System.out::println);

        int sum = families.stream()
                .mapToInt(family -> family.getSalary())
                .sum();
        System.out.println(sum);

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.isSex())
                .forEach(child -> System.out.println(child));


        System.out.println("-----------------");

        families.stream()
                .limit(2)
                .flatMap(family -> family.getChildren().stream())
                .distinct()
                .forEach(System.out::println);

        System.out.println("---------");

        families.stream()
                .filter(family -> family.isY())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("----------");

        boolean b = families.stream()
                .anyMatch(family -> family.getSalary() < 5000);


        System.out.println(b);


        System.out.println("----------");

        families.stream()
                .sorted(new FamilyComparator())
                .forEach(System.out::println);


        System.out.println("-----------");

        Family family4 = families.stream()
                .filter(family -> family.getSalary() > 29000)
                .findFirst().orElse(new Family("Family4", true, 0, null));

        System.out.println(family4);

        System.out.println("---------");

        families.stream()
                .map(family -> family.isY())
                .map(y -> new Address(y))
                .map(add -> add.getStreet())
                .forEach(System.out::println);

        //HOMEWORK
        System.out.println("----------GET CHILDREN NAME WITH 2 IN NAME-------------");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(two -> two.getName().contains("2"))
                .forEach(System.out::println);


        System.out.println("--------GET PARENTS WHICH HAVE MORE THAN 3 CHILDREN");

        families.stream()
                .filter(child-> child.getChildren().size() > 3)
                .forEach(System.out::println);

        System.out.println("-----------get all boys-----------");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.isSex() == true )
                .forEach(System.out::println);


        System.out.println("----------GET ALL GIRLS---------");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(girls -> girls.isSex() == false)
                .forEach(System.out::println);


        System.out.println("All CHILDREN NAME TO UPPERCASE");


        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .map(child -> child.getName().toUpperCase())
                .forEach(System.out::println);











    }
}
