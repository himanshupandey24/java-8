package org.learnjava.functional_Interface;

import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> divisibleBy2v0 = ele -> { return ele%2 == 0; };
    private static Predicate<Integer> divisibleBy2 = ele -> ele%2 == 0;
    private static Predicate<Integer> divisibleBy5 = ele -> ele%5 == 0;

    private static void predicateAnd(){
        System.out.println("Result in predicateAnd : " + divisibleBy2.and(divisibleBy5).test(10));
    }

    private static void predicateOr(){
        System.out.println("Result in predicateOr : " + divisibleBy2.or(divisibleBy5).test(7));
    }

    private static void predicateNegate(){
        System.out.println("Result in predicateNegate : " + divisibleBy2.and(divisibleBy5).negate().test(7));
        //equivalent to reversing the result
    }

    public static void main(String[] args) {
        boolean test = divisibleBy5.test(10);
        boolean test1 = divisibleBy2.test(12);

        System.out.println(test);
        System.out.println(test1);
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
