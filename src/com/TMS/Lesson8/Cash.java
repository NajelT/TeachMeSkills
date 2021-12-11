package com.TMS.Lesson8;

import java.util.Deque;
import java.util.LinkedList;

public class Cash {
        public static final int MAX_SIZE = 5;
        private final Deque<String> queue = new LinkedList<>();

        public void add(String value) throws CacheOverflowException {
            if (queue.size() == MAX_SIZE) {
                throw new CacheOverflowException(MAX_SIZE, value);
            }
            queue.add(value);
        }

        public String removeFirst() throws CashElementNotFoundException {
            if (queue.isEmpty()) {
                throw new CashElementNotFoundException();
            }
            return queue.removeFirst();
        }
}
