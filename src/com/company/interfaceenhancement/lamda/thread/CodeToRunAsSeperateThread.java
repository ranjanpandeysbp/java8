package com.company.interfaceenhancement.lamda.thread;

public class CodeToRunAsSeperateThread implements Runnable {

    @Override
    public void run() {
        for (Integer count = 1; count <=5; count++){
            System.out.println("Child thread counter value is: "+count);
        }
    }
}
