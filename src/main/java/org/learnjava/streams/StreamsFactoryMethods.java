package org.learnjava.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFactoryMethods {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Cricket", "Volleyball", "Badminton");
        stringStream.forEach(System.out::println);

        List<Integer> integerList = Stream.iterate(1, (x) -> x*2)
                .limit(30)
                .collect(Collectors.toList());

        System.out.println("Iterate :" + integerList);

        Supplier<Integer> supplier = new Random()::nextInt;

        List<Integer> integerList1 = Stream.generate(supplier)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Generate : " + integerList1);
    }
}
