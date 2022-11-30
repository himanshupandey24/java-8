package org.learnjava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    private static int sumOfIntegers(List<Integer> integerList){

        return integerList.stream()
                .reduce(0,(x,y) -> x+y); // unboxing to convert Integer to an int to avoid that use IntStream
    }

    private static int sumOfIntStream(){
        return IntStream.range(1,6).sum() ;
    }

    private static int sumOfIntStreamRangeClosed(){
        return IntStream.rangeClosed(1,6).sum() ;
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of numbers are : " + sumOfIntegers(integerList));

        System.out.println("Sum of numbers using IntStream with Range are : " + sumOfIntStream());

        System.out.println("Sum of numbers using IntStream with Range Closed are : " + sumOfIntStreamRangeClosed());
    }
}
