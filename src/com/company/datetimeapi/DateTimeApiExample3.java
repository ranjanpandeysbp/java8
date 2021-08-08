package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeApiExample3 {

    public static void main(String[] a){

        // Get the total experience of an employee in years
        LocalDate todayDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2012, 03, 16);

        //Years of experience
        Period period = Period.between(startDate, todayDate); // startDate is inclusive and todayDate is exclusive
        System.out.println("Your years of experience is "+period.getYears());

        System.out.printf("Total experience is %d years, %d months, %d days ",period.getYears(), period.getMonths(), period.getDays());

        //you have exam at a date, you want to know how much time you have
    }
}
