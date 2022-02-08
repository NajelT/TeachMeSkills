package com.TMS.Lesson10;

import java.util.Comparator;

public class FamilyComparator implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
