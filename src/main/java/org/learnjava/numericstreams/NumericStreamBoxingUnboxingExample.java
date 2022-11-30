package org.learnjava.numericstreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    private static List<Integer> boxing(){
        return IntStream.rangeClosed(1,50)
                //Stream<Integer>
                .boxed()
                //all the elements will be passed one by one to get to the result as the collection.
                .collect(Collectors.toList());

    }

    private static int unBoxing(List<Integer> integerList){
        int sum = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Optional<Integer> sum1 = integerList.stream()
                .reduce((x, y) -> x+y);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Converting PrimitiveStream to List : "+ boxing());
        List<Integer> integerList = boxing();
        System.out.println("Sum using Unboxing : "  + unBoxing(integerList));
    }
}
