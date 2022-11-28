package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    private static List<String> namesList(){
        List<String> names = StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
        return names;
    }

    private static Set<String> namesSet(){
        Set<String> names = StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());

        return names;
    }

    private static Map<String, Integer> namesLengthMap(){
        Map<String, Integer> namesLength = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName, student -> student.getName().length()));

        return namesLength;
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
        System.out.println(namesLengthMap());
    }
}
