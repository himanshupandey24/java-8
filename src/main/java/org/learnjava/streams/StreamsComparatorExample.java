package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    private static List<Student> sortStudentsByName(){
        return StudentDatabase.getStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentsByGpa(){

        return  StudentDatabase.getStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentsByGpaReversed(){

        return  StudentDatabase.getStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("\nStudents sorted by NAME\n");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("\nStudents sorted by GPA\n");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("\nStudents sorted by GPA Higher to Lower\n");
        sortStudentsByGpaReversed().forEach(System.out::println);
    }

}
