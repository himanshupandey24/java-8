package org.learnjava.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

    private static void parseTime(){
        String time = "15:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("String to LocalTime using LocalTime.parse(time): " + localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("\nString to LocalTime using LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME): "
                + localTime1
        );

        //Custom Defined Format
        //H -> 24-hour format
        //h-> 12-hour format

        String time1 = "14*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
        System.out.println("\nString to LocalTime using Custom DateTimeFormatter : " + localTime2);

        String time2 = "13*30*30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);

        System.out.println("\nString to LocalTime using Custom DateTimeFormatter : " + localTime3);

    }

    private static void formatTime(){

        LocalTime localTime = LocalTime.now();
        System.out.println("\nLocal Time is : " + localTime);
        String time = localTime.toString();
        System.out.println("LocalTime to String using localTime.toString() : " + time);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");

        String time1 = dateTimeFormatter.format(localTime);
        System.out.println("LocalTime to String using dateTimeFormatter.format(localTime) : " + time1
                + "\nLocalTime to String using dateTimeFormatter.format(localTime) : " + dateTimeFormatter1.format(localTime)
        );
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
