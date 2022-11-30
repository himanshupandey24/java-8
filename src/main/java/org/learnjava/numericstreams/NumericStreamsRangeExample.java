package org.learnjava.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangeExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("\nTotal number of elements : " + intStream.count());
        //intStream.forEach(System.out::println); // runtime error stream has already been operated upon or closed

        IntStream.range(1,50).forEach(value -> System.out.print(value+ " "));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+ " "));
        System.out.println();

        System.out.println("Total no of elements using rangeClosed : " + IntStream.rangeClosed(1,50).count());

        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + " "));
        System.out.println();
        IntStream.rangeClosed(1,35).asDoubleStream().forEach(value -> System.out.print(value+ " "));
        System.out.println();
        LongStream.rangeClosed(1,35).asDoubleStream().forEach(value -> System.out.print(value+ " "));

    }
}
