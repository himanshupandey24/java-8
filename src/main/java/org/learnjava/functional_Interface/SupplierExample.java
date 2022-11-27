package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static Supplier<Student> studentSupplier = () -> new Student(
            "Adam",
            3,
            4,
            "Male",
            Arrays.asList("swimming", "basketball","volleyball"));

    public static  Supplier<List<Student>> listofStudentsSupplier = () -> StudentDatabase.getStudents();

    public static void main(String[] args) {
        Student student = studentSupplier.get();
        System.out.println("Student is : " + student);
        System.out.println("Students are : " + listofStudentsSupplier.get());
    }
}
