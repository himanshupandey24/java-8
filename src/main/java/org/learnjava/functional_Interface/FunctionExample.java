package org.learnjava.functional_Interface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> upperCase = name -> name.toUpperCase();
    static Function<String, String> lowerCase  = name -> name.toLowerCase();
    static Function<String, String> appendString = s -> s.concat("Hi");
    static Function<String, Integer> strLength = s -> s.length();

    public static void main(String[] args) {
        System.out.println("Result is: " + upperCase.apply("Java17"));
        System.out.println("Result of andThen : " + upperCase.andThen(appendString).apply("java17"));
        //for compose first appendString will work then upperCase will work
        System.out.println("Result of compose : " + upperCase.compose(appendString).apply("java17"));

        Function<String, String> getIdentity = Function.identity();
        System.out.println(getIdentity.apply("ABC"));
    }
}
