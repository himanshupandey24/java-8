package org.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxMinExample {

    private static Optional<Integer> maxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::max); // .reduce((a,b) -> (a>b) ? a:b);
    }

    private static Optional<Integer> minValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) ->{
                    System.out.println(a + " " + b);
                    return a<b? a : b;
                }); // .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,8,9,5,12);
        Optional<Integer> maxValue = maxValue(integers);
        int max = maxValue.isPresent() ? maxValue.get() : 0;
        System.out.println("Max Value is : " + max);

        Optional<Integer> minValue =minValue(integers);
        int min = maxValue.isPresent() ? minValue.get():0;
        System.out.println("Min Value is : " + min);
    }
}
