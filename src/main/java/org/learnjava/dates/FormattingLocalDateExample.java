package org.learnjava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {


    private static void parseLocalDate(){
        //Converting String to LocalDate

        //Version 1
        String date ="2022-11-24";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("\nString date to Local Date : " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("\nString date to Local Date using DateTimeFormatter.ISO_LOCAL_DATE : " + localDate1);

        String date1 = "20221215";
        LocalDate localDate2 = LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("\nString date to Local Date using DateTimeFormatter.BASIC_ISO_DATE :" + localDate2);

        //Custom Defined Format
        String date2 = "2022|12|21";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);

        System.out.println("\nString date to Local Date using Custom DateTimeFormatter : " + localDate3);

        String date3 = "2022*11*24";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);

        System.out.println("\nString date to Local Date using Custom DateTimeFormatter :  " + localDate4);
    }

    private static void formatLocalDate(){
        //Converting LocalDate to String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.toString();
        String formattedDate1 = localDate.format(dateTimeFormatter);

        System.out.println("\nLocal Date to String using localDate.toString() : " + formattedDate
                + "\nLocal Date to String using localDate.format(dateTimeFormatter) : " + formattedDate1
        );

    }
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
