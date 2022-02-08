package com.TMS.Lesson10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(12, 13, 124, 23, 643, 123, 2, 47, 1, 693));

        //Find max value
        Integer max = arr
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println(max);

        //Find sum of odds nums
        Integer sum = arr
                .stream()
                .mapToInt(value -> value)
                .filter(value -> value % 2 == 0)
                .sum();


        System.out.println(sum);


        //Greater than five
        int[] array = {19,274,274,1,3,6,2984,5,283,1,0,3};

        int[]result = IntStream.of(array)
                .filter(value -> value > 5)
                .toArray();

        System.out.println(Arrays.toString(result));


    }



    }



