package com.TMS.Lesson9;

import java.util.HashMap;

public class Map {
        public static void main(String[] args) {
            int[] array = new int[]{13, 5, 1,9, 2, 3, 3, 5, 6, 7, 8,9,7,3, 9};
            HashMap<Integer, Integer> map = new HashMap<>();

            for (Integer i : array) {
                Integer value = map.get(i);
                if (value == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, ++value);
                }
            }
            System.out.println(map);

        }
    }

