package com.company.interfaceenhancement.doublecolonoperator;

public class OneMain {

    public static void main(String[] args){

        //Employee employee = new Employee();
        /*LambdaOne lambdaOne = () -> System.out.println("From lambda one");
        lambdaOne.show();

        LambdaOne lambdaOne1 = employee :: details;
        lambdaOne1.show();*/

        /*LambdaTwo lambdaTwo = employee :: details2;
        lambdaTwo.show2(55);*/

        LambdaTwo lambdaTwoStatic = Employee :: detailsStatic;
        lambdaTwoStatic.show2(60);
    }
}
