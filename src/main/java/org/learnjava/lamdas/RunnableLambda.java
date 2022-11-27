package org.learnjava.lamdas;

public class RunnableLambda {
    public static void main(String[] args) {

        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };

        new Thread(runnable).start();

        //Java 8 - Lambda Syntax

        // ()->{}
        //assigning a lambda to a variable.
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable Lambda 1");
        Runnable runnableLambda2 = () -> {System.out.println("Inside Runnable Lambda 2");
        System.out.println("Inside Runnable Lamda 2 print statement 2");
        };

        //passing lambda variable to thread
        new Thread(runnableLambda1).start();
        new Thread(runnableLambda2).start();

        /**
         * Prior Java 8
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread and Inside Run");
            }
        }).start();

        //Java 8 - Lambda Syntax

        new Thread(() -> System.out.println("Inside Thread and Inside Lambda")).start();

    }
}
