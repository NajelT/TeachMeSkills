package com.TMS.Lesson8;

public class CashElementNotFoundException extends Exception{
    public CashElementNotFoundException() {
        super("Cash element wasn't found");
    }
}
