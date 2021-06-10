package com.company.interfaceenhancement.staticmethod;

public class StaticMethodDemoClass implements StaticMethodDemo {

    public static void show(){ // static method do not get available in implementing class
        System.out.println("I am a normal method of this class StaticMethodDemoClass ");
    }

    public static void main(String[] a){
        StaticMethodDemoClass obj = new StaticMethodDemoClass();
        obj.show();
        StaticMethodDemo.show();// static method can be called by the name of the interface
    }


}
