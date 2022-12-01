package org.learnjava.optional;

import org.learnjava.data.Student;

import java.util.Optional;

public class OptionalOrElseExample {

    private static String optionalOrElse(){
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");

        return name;
    }

    private static String optionalOrElseGet(){

        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name =  optionalStudent.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    private static String optionalOrElseThrow(){

        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name =  optionalStudent.map(Student::getName)
                .orElseThrow(()->new RuntimeException("No Data available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
