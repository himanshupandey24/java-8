package org.learnjava.defaults;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("Inside method C of Interface3");
    }

    @Override
    default void methodA() {
        Interface2.super.methodA();
        System.out.println("Inside method A of Interface3");
    }
}
