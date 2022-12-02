package org.learnjava.defaults;

public interface Interface3 extends Interface1, Interface2{
    default void methodC(){
        System.out.println("Inside method C");
    }
    default void methodA(){
        System.out.println("Inside method A "+ Interface3.class);
    }
}
