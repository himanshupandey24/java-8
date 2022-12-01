package org.learnjava.optional;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

    private static String getStudentName(){

        //Student student = StudentDatabase.studentSupplier.get();

        Student student = null;
        if(student != null)
            return student.getName();
        else
            return null;
    }

    private static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        //Optional<Student> studentOptional = Optional.ofNullable(null);

        if(studentOptional.isPresent())
            return studentOptional.map(Student::getName); // don't get confused this with streams map method. Both are different.

        return Optional.empty(); // Represents an optional object with no value
    }


    public static void main(String[] args) {
        String name = getStudentName();
        if(name != null)
            System.out.println(name.length());
        else
            System.out.println("No name available");

        if(getStudentNameOptional().isPresent())
            System.out.println(getStudentNameOptional().get().length());
        else
            System.out.println("Name is empty");
    }
}
