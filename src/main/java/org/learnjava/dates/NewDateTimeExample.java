package org.learnjava.dates;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {

        System.out.println(Clock.systemDefaultZone());
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time : " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local DateTime : " + localDateTime);
    }
}
