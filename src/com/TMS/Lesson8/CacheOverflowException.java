package com.TMS.Lesson8;

public class CacheOverflowException extends Exception {
    public CacheOverflowException(int maxSize, String element) {
        super("Cash is full (Maximum count of elements: " + maxSize
                + "), entered word '" + element + "' wasn't saved");
    }

}
