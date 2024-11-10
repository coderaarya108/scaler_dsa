package com.oreilly.headfirstjava.streamsNlambdas;

import com.scaler.dsa.sorting.SortingUtils;

import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {

    public static void main(String[] args) {

        List<String> coffees = List.of("Cappuccino" , "Americano" , "Espresso" ,
                                        "Cortado", "Mocha", "Cappuccino", "Flat White" ,
                                        "Latte");


        List<String> coffeesEndingInO = coffees.stream()
                .distinct()
                .sorted()
                .filter( s -> s.endsWith("o"))
                .collect(Collectors.toList());

        System.out.println(coffees.stream().count());

        System.out.println(coffeesEndingInO);

        coffees.forEach((String str) -> System.out.println(str));

        Runnable runnable = () -> System.out.println("Testing lambdas");
        runnable.run();
    }

}
