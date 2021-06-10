package com.company.interfaceenhancement.defaultmethod;

public class Car implements VehicleJava8 {

    public static void main(String[] a){
        Car car = new Car();
        car.details();
        car.mileage();
    }

    @Override
    public void mileage() {

    }
}
