package com.TMS.Lesson6;

public class Main {
    public static void main(String[] args) {
        Finder finder = new FinderImpl();
        Director director1 = new Director("Ilja", "Lushpajev", 5,2000);
        Director director2 = new Director("Elvira", "Tovpeko", 2,2000);

        Employee worker1 = new Worker("Alex", "Andreenkov", 2, 1000);
        Employee worker2 = new Worker("Georgi", "Prelovski", 2, 1000);
        Employee worker3 = new Worker("Leo", "Salamatin", 1, 1000);

        director1.addWorker(worker1);
        director2.addWorker(worker2);
        director2.addWorker(worker3);
        director1.addWorker(director2);
        director1.getSubInfo();
        System.out.println("----------");
        finder.find(director1, "Leo");







    }
}
