package org.learnjava.streams;

import org.learnjava.data.StudentDatabase;

public class StreamMatchExample {
    private static boolean allMatch(){
        boolean result = StudentDatabase.getStudents().stream().allMatch(student -> student.getGpa() >= 3.9);
        return result;
    }

    private static boolean anyMatch(){
        boolean result = StudentDatabase.getStudents().stream().anyMatch(student -> student.getGpa() >= 3.9);
        return result;
    }

    private static boolean noneMatch(){
        boolean result = StudentDatabase.getStudents().stream().noneMatch(student -> student.getGpa() >= 3.9);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result of allMatch : " + allMatch());
        System.out.println("Result of anyMatch : " + anyMatch());
        System.out.println("Result of noneMatch : " + noneMatch());
    }
}
