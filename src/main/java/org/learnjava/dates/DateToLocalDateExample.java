package org.learnjava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        //java.util.Date to java.time.LocalDate

        Date date = new Date();
        System.out.println("\nJava.Util.Date : " + date
                + "\nConverted Local Date : "
                + date.toInstant().atZone(ZoneId.of("Asia/Calcutta")).toLocalDate()
        );

        Date date1 = new Date().from(
                LocalDate.now()
                        .atTime(LocalTime.now())
                        .atZone(ZoneId.systemDefault())
                        .toInstant()
        );
        System.out.println("java.util.date is : " + date1);

        //LocalDate to JavaSql Date

        java.sql.Date date2 = java.sql.Date.valueOf(LocalDate.now());
        System.out.println("java.sql.date is : " + date2);

        LocalDate localDate = date2.toLocalDate();
        System.out.println("java.sql.date to local date : " + localDate);

    }
}
