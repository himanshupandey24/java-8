package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Optional;

public class StreamFindAny_FindFirst_Example {
    private static Optional<Student> findAny(){
        return StudentDatabase.getStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.8)
                .findAny();
    }

    private static Optional<Student> findFirst(){
        return StudentDatabase.getStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.8)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent = findAny();
        if(findAnyStudent.isPresent())
            System.out.println("Student is :" + findAnyStudent.get());
        else
            System.out.println("No Student Found");

        Optional<Student> findFirst = findFirst();
        if(findFirst.isPresent())
            System.out.println("Student is :" + findFirst.get());
        else
            System.out.println("No Student Found");
    }
}
