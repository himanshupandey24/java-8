package org.learnjava.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListEnhancements {

    private static List<String> names = Arrays.asList("Dave", "Jessica", "Alex", "Dan");
    private static void listForEach(){
        for(String name : names)
            System.out.print(name + " ");

        System.out.println();

        names.forEach(System.out::println);


        List<String> strings = Arrays.asList("one", "two", "three", "four");
        AtomicInteger count = new AtomicInteger();

        strings.forEach(name ->{
            System.out.println("name : " + name);
            System.out.println(count.getAndIncrement());
        });
    }
    public static void main(String[] args) {
        listForEach();
    }
}
