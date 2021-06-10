package com.company.interfaceenhancement.staticmethod;

public interface StaticMethodDemo {

    public static void show(){ // static method do not get available in implementing class
        System.out.println("I am a Java 8 static method");
    }

    public static void show2(){ // static method do not get available in implementing class
        System.out.println("I am a Java 8 static method 2");
    }
}
