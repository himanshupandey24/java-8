package org.learnjava.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : " + localDate);

        //Creating Date
        LocalDate localDate1 = LocalDate.of(1996,11,24);
        LocalDate localDate2 = LocalDate.of(1997, Month.NOVEMBER, 24);
        System.out.println("Created Date : " +localDate1);
        System.out.println("Created Date : " +localDate2);

        System.out.println("Year Day Date as LocalDate.ofYearDay(2021, 324) : " + LocalDate.ofYearDay(2021, 324));

        System.out.println("Epoch Day Date as LocalDate.ofEpochDay(-1): " + LocalDate.ofEpochDay(-1));
        System.out.println("Epoch Day Date as LocalDate.ofEpochDay(0) : " + LocalDate.ofEpochDay(0));
        System.out.println("Epoch Day Date as LocalDate.ofEpochDay(2) : " + LocalDate.ofEpochDay(2));

        /**
         * Getting Values from Local Date
         */

        System.out.println("Day of the Month : " + localDate.getDayOfMonth());
        System.out.println("Day of the Week : " + localDate.getDayOfWeek());
        System.out.println("Day of the Year : " + localDate.getDayOfYear());
        System.out.println("Month : " + localDate.getMonth());
        System.out.println("Month Value : " + localDate.getMonthValue());
        System.out.println("Year : " + localDate.getYear());
        System.out.println("Era : " + localDate.getEra());
        System.out.println("Chronology : " + localDate.getChronology());

        System.out.println("Day of Month using localDate.get(ChronoField.DAY_OF_MONTH): "
                +localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying Values in Local Date
         */

        System.out.println("Adding 5 days to now Date using localDate.plusDays(5) : "
                +localDate.plusDays(5));
        System.out.println("Adding 2 weeks to now Date using localDate.plusWeeks(2) : "
                +localDate.plusWeeks(2));
        System.out.println("Adding 2 months to now Date using localDate.plusMonths(2) : "
                +localDate.plusMonths(2));
        System.out.println("Adding 5 year to now Date using localDate.plusYears(5) : "
                +localDate.plusYears(5));

        System.out.println("Subtracting 5 days to now Date using localDate.minusDays(5) : "
                +localDate.minusDays(5));
        System.out.println("Subtracting 2 weeks to now Date using localDate.minusWeeks(2) : "
                +localDate.minusWeeks(2));
        System.out.println("Subtracting 2 months to now Date using localDate.minusMonths(2) : "
                +localDate.minusMonths(2));
        System.out.println("Subtracting 5 year to now Date using localDate.minusYears(5) : "
                +localDate.minusYears(5));




    }
}
