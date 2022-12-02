package org.learnjava.defaults;

public class InterfaceImpl2 implements Interface1, Interface4{

    @Override
    public void methodA() {
        Interface1.super.methodA();
        Interface4.super.methodA();
        System.out.println("Inside method A of InterfaceImpl2");

    }

    public static void main(String[] args) {
        InterfaceImpl2 interfaceImpl2 = new InterfaceImpl2();
        interfaceImpl2.methodA();
    }
}
