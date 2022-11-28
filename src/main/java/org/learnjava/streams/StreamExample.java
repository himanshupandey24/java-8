package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        Predicate<Student> filterByGrade = student -> student.getGradeLevel()>=3;
        Predicate<Student> filterByGpa = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentActivities =
                StudentDatabase.getStudents().stream().
                        collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));

        Map<String, List<String>> studentActivities1 =
                StudentDatabase.getStudents().stream().
                        collect(Collectors.toMap(Student::getName, Student::getActivities));

        //System.out.println(studentActivities1);

        //Collect is responsible for initiating stream pipeline, Streams are lazy loaded in nature

        Map<String, List<String>> studentActivities2 = StudentDatabase.getStudents()
                .stream().peek(student -> {
                    System.out.println(student);
                }).filter(filterByGpa.and(filterByGrade))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentActivities2);
    }
}
