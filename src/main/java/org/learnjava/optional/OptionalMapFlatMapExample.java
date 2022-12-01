package org.learnjava.optional;

import org.learnjava.data.Bike;
import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    private static void optionalFlatMap(){
        Optional<Student> studentOptional = StudentDatabase.getOptionalStudent();
        if(studentOptional.isPresent()){
            Optional<Bike> bikeOptional = studentOptional.flatMap(Student::getBike);

            System.out.println("bikeOptional : " + bikeOptional );
        }
    }

    private static void optionalMap(){
        Optional<Student> studentOptional = StudentDatabase.getOptionalStudent();

        if(studentOptional.isPresent()){
            Optional<String> nameOptional= studentOptional.
                    map(Student::getName);
            System.out.println("nameOptional : " + nameOptional);
        }
    }

    private static void optionalFilter(){
        Optional<Student> studentOptional = StudentDatabase.getOptionalStudent()
                .filter(student -> student.getGpa() >= 3.9);

        studentOptional.ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        optionalFlatMap();
        optionalMap();
        optionalFilter();
    }
}
