package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterExample {
    private static List<Student> filterStudents(){
        List<Student> filterStudentList = StudentDatabase.getStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());

        return filterStudentList;
    }

    public static void main(String[] args) {
        System.out.println("Filtered Students : " + filterStudents());
    }
}
