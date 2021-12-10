package com.TMS.Lesson6;

public class FinderImpl implements Finder {

    @Override
    public void find(Director director, String workerName) {
        for (Employee employee : director.getCountOfWorkers()) {
            if (employee instanceof Director) {
                find((Director) employee, workerName);
                return;
            } else if ((employee.getName()).equals(workerName)) {
                System.out.println("we found " + workerName + " ! This worker under " + director.getName() + " supervision.");
                return;
            }
        }
    }
}
