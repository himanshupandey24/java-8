package org.learnjava.methodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCase = String::toUpperCase;
    static Function<String, String> toUpperCase1 = s -> s.toUpperCase();

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("Java17"));
        System.out.println(toUpperCase1.apply("java17"));
    }
}
