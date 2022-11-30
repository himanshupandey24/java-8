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

        //StudentDatabase.getStudents().stream().min(Comparator.comparing(Student::getGpa));
        return studentOptional;
    }

    private static Optional<Student> maxBy(){

        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        return studentOptional;
    }

    private static List<Student> maxByMultipleStudents(){
        List<Student> maxStudents = new ArrayList<>();
        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        Student maxStudent = studentOptional.isPresent() ? studentOptional.get() : null;
        if(maxStudent != null){
            maxStudents = StudentDatabase.getStudents()
                    .stream()
                    .filter(student -> maxStudent.getGpa() == student.getGpa())
                    .collect(Collectors.toList());
            System.out.println("Max Students are : " + maxStudents);
        }
        return maxStudents;
    }


    public static void main(String[] args) {
        System.out.println(minBy());
        System.out.println(maxBy());
        System.out.println(maxByMultipleStudents());
    }
}
