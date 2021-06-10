package com.company.interfaceenhancement.lamda.thread;

public class ThreadMain {

    public static void main(String[] a){

        //Runnable runnable = new CodeToRunAsSeperateThread();

        Runnable runnable = () -> {
            for (Integer count = 1; count <=5; count++){
                System.out.println("Child thread counter value is: "+count);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (Integer count = 1; count <=5; count++){
            System.out.println("Main thread counter value is: "+count);
        }
    }
}
