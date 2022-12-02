package org.learnjava.defaults;

public interface Interface2 extends Interface1{
    default void methodB() {
        System.out.println("Inside method B of Interface2");
    }

    @Override
    default void methodA() {
        Interface1.super.methodA();
        System.out.println("Inside method A of Interface2");
    }
}
