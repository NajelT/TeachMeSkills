package com.TMS.Lesson8;

import java.util.Scanner;

public class Main {
        private static final String GET = "get";
        private static final Cash CASH = new Cash();

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Reserved word '" + GET
                    + "' deleting the most older value form cash and can't be added in cash");

            while (true) {
                System.out.println("enter the value: ");
                String value = console.nextLine();
                try {
                    if (GET.equals(value)) {
                        System.out.println("The first element was deleted '" +CASH.removeFirst() + "'");
                    } else {
                        CASH.add(value);
                        System.out.println("Added element " + value);
                    }
                } catch (CashElementNotFoundException | CacheOverflowException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

