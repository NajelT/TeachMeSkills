package com.TMS.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String name;
    private boolean isY;
    private int salary;
    List<Child> children = new ArrayList<>();

    public Family(String name, boolean isY, int salary, List<Child> children) {
        this.name = name;
        this.isY = isY;
        this.salary = salary;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isY() {
        return isY;
    }

    public void setY(boolean y) {
        isY = y;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", isY=" + isY +
                ", salary=" + salary +
                ", children=" + children +
                '}';
    }
}
