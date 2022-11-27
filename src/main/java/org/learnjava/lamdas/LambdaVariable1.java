package org.learnjava.lamdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;
        // Compilation issue Variable 'i' is already defined in the scope
        //Consumer<Integer> c1 = i -> System.out.println(i);
    }
}
