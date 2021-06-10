package com.company.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {

    default void details(){// by default gets availabel to all implementing classes
        System.out.println("I am Java 8 default method");
    }
    default void mileage(){

    }
}
