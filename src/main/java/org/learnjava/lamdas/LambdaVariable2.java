package org.learnjava.lamdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int val1 = 5;
    public static void main(String[] args) {
        int val = 4;
        Consumer<Integer> c1 = i -> {
            // Compilation Error Variable used in lambda expression should be final or effectively final
            val1++;
            System.out.println(val1 + i);
        };
        c1.accept(4);
    }
}
