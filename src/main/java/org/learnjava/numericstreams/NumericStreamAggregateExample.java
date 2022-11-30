package org.learnjava.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,100).sum();
        System.out.println("Sum : " + sum);

        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("If Max Present : " + max.isPresent());
        System.out.println("MAx is : " + max.getAsInt());

        OptionalLong min = LongStream.rangeClosed(1,50).min();
        System.out.println("Min is :" + min.getAsLong());

        OptionalDouble avg = LongStream.rangeClosed(1,50).average();
        System.out.println("Avg is : " + avg.getAsDouble());


    }
}
