package org.learnjava.functional_Interface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (a,b) -> (a*b);
        System.out.println("Multiplication is: " + multiplication.apply(10,4));

        BinaryOperator<Integer> getMax = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> getMin = BinaryOperator.minBy(comparator);
        System.out.println("Max is: " + getMax.apply(5, 6));
        System.out.println("Min is: " + getMin.apply(5, 6));
    }
}
