package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    private static Optional<Student> minBy(){
        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

        System.out.println("\n Min is : " + StudentDatabase.getStudents()
                .stream()
                .min(Comparator.comparing(Student::getGpa)));

        return studentOptional;
    }

    private static Optional<Student> maxBy(){

        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        System.out.println("\n Max is : " + StudentDatabase.getStudents()
                .stream()
                .max(Comparator.comparing(Student::getGpa)));

        return studentOptional;
    }

    private static List<Student> maxByMultipleStudents(){

        List<Student> maxStudents = new ArrayList<>();
        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream().max(Comparator.comparing(Student::getGpa));

        Student maxStudent = studentOptional.isPresent() ? studentOptional.get() : null;
        Student maxStudent1 = studentOptional.orElse(null);

        if(maxStudent != null){

            maxStudents = StudentDatabase.getStudents()
                    .stream()
                    .filter(student -> maxStudent.getGpa() == student.getGpa())
                    .collect(Collectors.toList());

            //System.out.println("\n Max Students are : " + maxStudents);
        }

        return maxStudents;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("\n" + minBy());
        System.out.println("\n" + maxBy());
        System.out.println("\n" + maxByMultipleStudents());

    }
}
