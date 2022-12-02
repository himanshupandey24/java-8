package org.learnjava.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5,7,9);
        System.out.println("Result is : " + multiplier.multiply(integerList));
        System.out.println("Input List size is : " + multiplier.size(integerList));
        System.out.println("Is Empty : " + Multiplier.isEmpty(integerList));
    }
}
