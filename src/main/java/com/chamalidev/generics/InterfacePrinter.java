package com.chamalidev.generics;

import java.io.Serializable;

public class InterfacePrinter <T extends Animal & Serializable>{
    // Can extend one class and any number of interfaces
    T thingToPrint;

    public InterfacePrinter(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
