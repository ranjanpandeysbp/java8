package com.company.interfaceenhancement.doublecolonoperator;

public class Employee {

    public Employee(){
        System.out.println("Default constructor");
    }

    public void details(){
        System.out.println("Showing employee details");
    }

    public void details2(int number){
        System.out.println("emp details 2 with 1 param "+number);
    }

    public static void detailsStatic(int number){
        System.out.println("emp detailsStatic with 1 param "+number);
    }
}
