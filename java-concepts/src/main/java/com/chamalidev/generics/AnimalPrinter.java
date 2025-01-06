package com.chamalidev.generics;

public class AnimalPrinter<T extends Animal> {
    // printer for any type of animal

    T thingToPrint;

    public AnimalPrinter(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
