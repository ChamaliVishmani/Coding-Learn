package com.chamalidev.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args){
        Printer<Integer> integerPrinter = new Printer<>(23);
        // Now T type in printer is Integer
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(33.4);
        doublePrinter.print();

        // Printer<boolean> primitivePrinterError = new Printer<>(true);
        // Generic doesn't work with primitive types ex : int, boolean

        // example : collections (ArrayList,..)
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tom"));

        // ---- GENERIC CLASSES ----

        // Error : Type parameter 'java. lang. Integer' is not within its bound; should extend 'com. chamalidev. generics. Animal'
        // AnimalPrinter<Integer> integerPrinterAnimalError = new AnimalPrinter<>(23);

        AnimalPrinter<Cat> animalPrinter = new AnimalPrinter<>(new Cat("Tom"));
        animalPrinter.print();

        // ---- GENERIC METHODS ----

        shout(7);
        shout("Hi");

        shoutMultiple(10, "On");

        // ---- WILD CARDS ----

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        printList(integerList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Tom"));
        printList(catList);
    }

    // ---- GENERIC METHODS ----

    // generic method
    private static <T> void shout(T thingToShout){
        System.out.println(thingToShout+"!!!");
    }

    // multiple generic types
    private static <T,V> void shoutMultiple(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout+" "+otherThingToShout+"!!!");
    }

    // generic return type
    private static <T,V> T shoutReturnGeneric(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout+" "+otherThingToShout+"!!!");
        return thingToShout;
    }

    // ---- WILD CARDS ----

    private static void printList(List<?> myList){
        // use ? wild card when we don't know what generic type will be
        System.out.println();
    }

    // bounded wild cards
    private static void printListBounded(List<? extends Animal> myList){
        System.out.println();
    }
}
