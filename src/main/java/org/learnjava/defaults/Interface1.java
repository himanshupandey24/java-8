package org.learnjava.defaults;

public interface Interface1 {
    default void methodA(){
        System.out.println("Inside method A of Interface1");
    }
}
