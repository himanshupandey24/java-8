package org.learnjava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    private static Optional<String> ofNullable(){
        return Optional.ofNullable(null);
    }

    private static Optional<String> of(){
        return Optional.of("Hello");
    }

    private static Optional<String> empty(){
        return Optional.empty();
    }
    public static void main(String[] args) {
         System.out.println(ofNullable().get()); //NoSuchElementException: No value present
         System.out.println(of());
         System.out.println(empty().get()); //NoSuchElementException: No value present
    }
}
