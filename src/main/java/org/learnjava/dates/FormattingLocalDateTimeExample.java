package org.learnjava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    private static void parseLocalDateTime(){
        String dateTime = "2022-12-13T14:33:33";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("\nString to LocalDateTime : " + localDateTime
                + "\nString to LocalDateTime : " + LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        );

        String dateTime1 = "2022-12-1214:33:33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss");

        String dateTime2 = "2022-12-12Time15:33:33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'Time'HH:mm:ss");

        System.out.println("\nCustom String to LocalDateTime : " + LocalDateTime.parse(dateTime1, dateTimeFormatter)
                + "\nCustom String to LocalDateTime : " + LocalDateTime.parse(dateTime2, dateTimeFormatter1)
        );

    }

    private static void formatLocalDateTime(){
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd' Time 'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();

        String convertedDate = localDateTime.format(dateTimeFormatter1);
        System.out.println("\nLocalDateTime to String : " + convertedDate);
    }
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
