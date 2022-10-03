package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Printer {

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final BigDecimal thingToPrint;

    public Printer(BigDecimal thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public BigDecimal getThingToPrint() {
        return thingToPrint;
    }
}
