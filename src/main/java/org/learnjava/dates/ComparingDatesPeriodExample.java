package org.learnjava.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        LocalDate localDate1 = LocalDate.of(2022,12, 31);


        Period period = localDate.until(localDate1);

        System.out.println("\n Get Days in that Period : " + period.getDays() // result is 30 days perform 31-1
                + "\n Get Months in that Period : " + period.getMonths() // result is 11 performs 12-1
                + "\n Get Yaers in that Period : " + period.getYears() // result is 0 as it performs 2022 - 2022
        );

        Period period1 = Period.ofDays(10);
        System.out.println("\nPeriod1.getDays() : " + period1.getDays());

        Period period2 = Period.ofYears(20);
        System.out.println("\nPeriod2.getYears() : " + period2.getYears()
                + "\nPeriod2.toTotalMonths() : " + period2.toTotalMonths()
        );

        Period period3 = Period.between(localDate, localDate1);
        System.out.println("\nPeriod 3 Days : " + period3.getDays()
                + "\nPeriod 3 Months : " + period3.getMonths()
                + "\nPeriod 3 Years : " + period3.getYears()
        );



    }
}
