package org.learnjava.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class InstantExample {
    public static void main(String[] args){
        // Represents the date and time in unix timestamp in a machine readable format.
        Instant instant = Instant.now();
        System.out.println("\nInstant is : " + instant);

        System.out.println("\nGet Epoch Seconds : " + instant.getEpochSecond()
                + "\nInstant.ofEpochSecond(0) : " + Instant.ofEpochSecond(0)
                + "\nInstant.ofEpochMilli(2000) : " + Instant.ofEpochMilli(2000)
        );
        Instant instant1 = Instant.now();
        System.out.println("\nInstant1 is : " + instant1);

        Duration duration = Duration.between(instant, instant1);

        System.out.println("\nDuration between two instances in Nano Seconds : " + duration.getNano()
        );
    }
}
