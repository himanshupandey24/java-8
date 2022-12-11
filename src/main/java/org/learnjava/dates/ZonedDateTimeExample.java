package org.learnjava.dates;

import java.time.*;
import java.util.Comparator;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("\nZoned Date Time is : " + zonedDateTime
                + "\nZone : " + zonedDateTime.getZone()
                + "\nZone Rules : " + zonedDateTime.getZone().getRules()
                + "\nZone ID : " + zonedDateTime.getZone().getId()
                + "\nZone OffSet : " + zonedDateTime.getOffset()
        );

        ZoneId.getAvailableZoneIds()
                        .stream()
                                .sorted(Comparator.naturalOrder())
                                        .forEach(System.out::println);

        System.out.println("Total Zone Size : " + ZoneId.getAvailableZoneIds().size());


        System.out.println("\nChicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago"))
                + "\nDetroit EST : " + ZonedDateTime.now(ZoneId.of("America/Detroit"))
                + "\nLA PST : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles"))
                + "\nDenver MST : " + ZonedDateTime.now(ZoneId.of("America/Denver"))
        );

        System.out.println("\nZonedDate Time using Clock : "
                + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));


        //LocalDateTime using TimeZones

        System.out.println("\nCurrent Date Time of System : "
                + LocalDateTime.now(ZoneId.of("Asia/Calcutta"))

                + "\nCurrent Date Time using Clock : "
                + LocalDateTime.now(Clock.system(ZoneId.of("Asia/Calcutta")))

                + "\nCurrent Date Time using Instant : "
                + LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Denver"))
        );

    }
}
