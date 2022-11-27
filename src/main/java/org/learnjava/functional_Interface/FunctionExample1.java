package org.learnjava.functional_Interface;

public class FunctionExample1 {

    public static String appendDefault(String input){
        return FunctionExample.appendString.apply(input);
    }

    public static void main(String[] args) {
        System.out.println(appendDefault("hello"));
    }
}
