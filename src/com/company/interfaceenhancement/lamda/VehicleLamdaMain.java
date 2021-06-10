package com.company.interfaceenhancement.lamda;

public class VehicleLamdaMain {

    public static void main(String[] args){
        Vehicle vehicle = ()-> {System.out.println("Vehicle details from lamda");};
        vehicle.details();

        //Calculator calculator = (Integer a, Integer b)-> a+b;
        //Calculator calculator = a -> a+a;
        Calculator calculator = (Integer a, Integer b)->{ return a+b; };
        Integer result = calculator.add(5, 9);
        System.out.println(result);

        //1. Remove modifier
        //2. Remove return type
        //3. Remove method name
        //4. Add -> (arrow) sign

        MultiplyInterface multiplyInterface = () -> System.out.println("I m a converted lamda function");
        multiplyInterface.multiply();

    }



}
