package org.learnjava.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("\nLocal Date : " + localDate);

        //Creating Date
        LocalDate localDate1 = LocalDate.of(1996,11,24);
        LocalDate localDate2 = LocalDate.of(1997, Month.NOVEMBER, 24);

        System.out.println("\nCreated Date : " + localDate1
                + "\nCreated Date : " + localDate2
        );

        System.out.println("Year Day Date as LocalDate.ofYearDay(2021, 324) : "
                + LocalDate.ofYearDay(2021, 324)
        );

        System.out.println("\nEpoch Day Date as LocalDate.ofEpochDay(-1): " + LocalDate.ofEpochDay(-1)
                + "\nEpoch Day Date as LocalDate.ofEpochDay(0) : " + LocalDate.ofEpochDay(0)
                + "\nEpoch Day Date as LocalDate.ofEpochDay(2) : " + LocalDate.ofEpochDay(2)
        );

        /**
         * Getting Values from Local Date
         */

        System.out.println("\nDay of the Month : " + localDate.getDayOfMonth()
                + "\nDay of the Week : " + localDate.getDayOfWeek()
                + "\nDay of the Year : " + localDate.getDayOfYear()
                + "\nMonth : " + localDate.getMonth()
                + "\nMonth Value : " + localDate.getMonthValue()
                + "\nYear : " + localDate.getYear()
                + "\nEra : " + localDate.getEra()
                + "\nChronology : " + localDate.getChronology()
        );


        System.out.println("\nDay of Month using localDate.get(ChronoField.DAY_OF_MONTH): "
                +localDate.get(ChronoField.DAY_OF_MONTH));


        /**
         * Modifying Values in Local Date
         */

        System.out.println("\nAdding 5 days to now Date using localDate.plusDays(5) : " + localDate.plusDays(5)
                + "\nAdding 2 weeks to now Date using localDate.plusWeeks(2) : " + localDate.plusWeeks(2)
                + "\nAdding 2 months to now Date using localDate.plusMonths(2) : " + localDate.plusMonths(2)
                + "\nAdding 5 year to now Date using localDate.plusYears(5) : " + localDate.plusYears(5)

        );

        System.out.println("\nSubtracting 5 days to now Date using localDate.minusDays(5) : "
                + localDate.minusDays(5)
                + "\nSubtracting 2 weeks to now Date using localDate.minusWeeks(2) : "
                + localDate.minusWeeks(2)
                + "\nSubtracting 2 months to now Date using localDate.minusMonths(2) : "
                + localDate.minusMonths(2)
                + "\nSubtracting 5 year to now Date using localDate.minusYears(5) : "
                +localDate.minusYears(5)
        );

        System.out.println("Chrono Unit : " + localDate.minus(2, ChronoUnit.DAYS));
        System.out.println("With Year : " +localDate.withYear(2019));




    }
}
