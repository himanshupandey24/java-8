package org.learnjava.defaults;

public class InterfaceImpl1 implements Interface1, Interface2, Interface3{

    @Override
    public void methodA() {
        Interface3.super.methodA();
        System.out.println("Inside method A of InterfaceImpl1");
    }

    // 1 -> Class that implements the interface.
    // 2 -> the sub interface that extends the interface.

    public static void main(String[] args) {
        InterfaceImpl1 interfaceImpl1 = new InterfaceImpl1();
        interfaceImpl1.methodA();// at runtime will call child implementation
        interfaceImpl1.methodB();
        interfaceImpl1.methodC();
    }
}
