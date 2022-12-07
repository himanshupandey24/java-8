package org.learnjava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(23,33);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(7,30,30);
        System.out.println(localTime2);

        //Getting Values from Local Time

        System.out.println("\nHours : " + localTime.getHour()
                + "\nMinutes : " + localTime.getMinute()
                + "\nSeconds : " + +localTime.getSecond()
        );

        System.out.println("\nUsing localTime.get(ChronoField.HOUR_OF_DAY) " + localTime.get(ChronoField.HOUR_OF_DAY)
                + "\nUsing localTime2.get(ChronoField.CLOCK_HOUR_OF_DAY): " + localTime2.get(ChronoField.CLOCK_HOUR_OF_DAY)
        );

        //Modifying Values

        System.out.println("\nModify Hours : " + localTime.minusHours(2)
                + "\nModify Hours using ChronoUnit : " + localTime.minus(2, ChronoUnit.HOURS)
                + "\nModify with localTime.with(LocalTime.MIDNIGHT) : " + localTime.with(LocalTime.MIDNIGHT)

                + "\nModify with localTime.with(ChronoField.HOUR_OF_DAY,22): "
                + localTime.with(ChronoField.HOUR_OF_DAY,22)

                + "\nModify Minutes : " + localTime.plus(2, ChronoUnit.MINUTES)
                + "\nModify with Hour : " + localTime.withHour(2)
        );

    }


}
