package org.learnjava.constructorReference;

import org.learnjava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String, Student> studentFunction = Student::new;

    //Student student = Student::new; // compilation issue

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Client123"));
    }
}
