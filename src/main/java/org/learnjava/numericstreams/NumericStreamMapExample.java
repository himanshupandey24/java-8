package org.learnjava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    private static List<Integer> mapToObj(){
        List<Integer> integerList = IntStream.rangeClosed(1,6)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());

        return integerList;
    }

    private static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i -> i)
                .sum();
    }

    private static long mapToLong(){
        return IntStream.rangeClosed(1,6)
                .mapToLong(i -> i)
                .sum();
    }


    public static void main(String[] args) {
        System.out.println("mapToObj : " + mapToObj());

        System.out.println("mapToDouble() : " + mapToDouble());

        System.out.println("mapToLong() : " + mapToLong());
    }
}
