package com.company.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeApiExample2 {

    public static void main(String[] a){

        LocalDate date = LocalDate.now();
        System.out.println("Date after 22 days "+date.plusDays(22));
        System.out.println("Date after 2 months "+date.plusMonths(2));
        System.out.println("Date after 3 years "+date.plusYears(3));

        System.out.println("Date before 10 days "+date.minusDays(10));
        System.out.println("Date before 2 months "+date.minusMonths(2));
        System.out.println("Date before 3 years "+date.minusYears(3));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("Time before 2hrs "+dateTime.minusHours(2));
        System.out.println("Date after 22 days "+dateTime.plusDays(22));
    }
}
