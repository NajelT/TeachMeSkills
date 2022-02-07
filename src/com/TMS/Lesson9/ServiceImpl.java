package com.TMS.Lesson9;

import java.util.*;

public class ServiceImpl implements Service {

    @Override
    public List<User> findByName(List<User> list, String name) {
        List<User> finalList = new ArrayList<>();
        for (User u : list) {
            if (u.getName().equals(name)) {
                finalList.add(u);
            }
        }
        return finalList;
    }

    @Override
    public Set<User> findByGender(Set<User> set, Gender gender) {
        Set<User> finalSet = new TreeSet<>();
        for (User u : set) {
            if (u.getGender().name().equals(gender.name())) {
                finalSet.add(u);
            }
        }
        return finalSet;
    }

    @Override
    public List<User> sortByAge(List<User> list) {
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).getAge() > list.get(i + 1).getAge()) ;
                User temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
        return list;
    }


}
