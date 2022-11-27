package org.learnjava.imperativeway_vs_declarativeway;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         */
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum += i;
        }

        System.out.println("Sum calculation using imperative style:" +sum);

        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */

        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum calculation using declarative style:" +sum1);
    }
}
