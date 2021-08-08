package com.company.datetimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiExample4 {

    public static void main(String[] a){

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My current time zone: "+zoneId);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local date and time: "+dateTime);

        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");
        System.out.println("Date Time at LA : "+LocalDateTime.now(zoneIdLA));

        System.out.println("Date Time at LA : "+ ZonedDateTime.now(zoneIdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");
        System.out.println("Date Time at GMT+05:30 : "+ ZonedDateTime.now(zoneIdGMT));

        ZoneId zoneIdGMT00 = ZoneId.of("GMT+00:00");
        System.out.println("Date Time at GMT+00:00 : "+ ZonedDateTime.now(zoneIdGMT00));

        System.out.println(Instant.now());//same as GMT+00:00
    }
}
