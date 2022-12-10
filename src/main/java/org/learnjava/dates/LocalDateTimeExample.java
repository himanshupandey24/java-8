package org.learnjava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("\nlocalDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022,12,02,22,30,30);
        System.out.println("\nlocalDateTime1 : " + localDateTime1);

        //Getting Values
        System.out.println("\ngetMinute : " + localDateTime.getMinute()
                + "\ngetHour : " + localDateTime.getHour()
                + "\nDAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH)
        );

        //Modifying Values in Local Time

        System.out.println("\nlocalDateTime : " + localDateTime
                + "\nplus 2 Days to localDateTime : " + localDateTime.plusDays(2)
                + "\nminus 2 Days to localDateTime : " + localDateTime.minusDays(2)
                + "\nwithMonth : " + localDateTime.withMonth(2)
                + "\nwith : " + localDateTime1.with(ChronoField.MONTH_OF_YEAR,3)
                + "\nfirstDay-ofNextMonth : " + localDateTime.with(TemporalAdjusters.firstDayOfNextMonth())
        );


        //Converting LocalDate, LocalTime to LocalDateTime and vice-versa

        LocalDate localDate = LocalDate.now();
        System.out.println("atTime : " + localDate.atTime(23,30));

        LocalTime localTime = LocalTime.now();
        System.out.println("atTime : " + localTime.atDate(localDate)
                + "\natStartDay : " + localDate.atStartOfDay()
        );

        System.out.println("\nLocalDateTime to LocalDate : " + localDateTime.toLocalDate()
                + "\nLocalDateTime to LocalTime : " + localDateTime.toLocalTime()
        );
    }

}
