package org.learnjava.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(21,30);
        LocalTime localTime1 = LocalTime.now();

        long hourDiff = localTime.until(localTime1, ChronoUnit.HOURS);
        System.out.println("Hour Diff between two times : " + hourDiff);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println("\nDuration in Secs : " + duration.getSeconds()
                + "\nDuration in Secs : " + duration.toSeconds()
                + "\nDuration in Minutes : " + duration.toMinutes()
                + "\nDuration in Millis : " + duration.toMillis()
        );

        Duration duration1 = Duration.ofHours(3);
        System.out.println("\n3 Hours Duration in Minutes : " + duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(3);
        System.out.println("\nMinutes Duration : " + duration2.toMinutes());

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 8, 15, 9,00);

        Duration duration3 = Duration.between(localDateTime1,localDateTime);

        System.out.println("Duration 3 in Days : " + duration3.toDays());
    }
}
