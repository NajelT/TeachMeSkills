package com.TMS.Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface Service {
    public List<User> findByName(List<User> list, String name);

    public Set<User> findByGender(Set<User> set, Gender gender);

    public List<User> sortByAge(List<User> list);

}
