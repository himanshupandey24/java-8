package org.learnjava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");

        //Prior Java8
        Collections.sort(stringList);
        System.out.println("\nSorted list using Collections.sort(stringList) : " +  stringList);

        //After Java8

        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using stringList.sort(Comparator.naturalOrder()) : " +  stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted list using stringList.sort(Comparator.reverseOrder()): " +  stringList);
    }
}
