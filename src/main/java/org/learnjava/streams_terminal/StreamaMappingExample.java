package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamaMappingExample {
    public static void main(String[] args) {
        Set<String> namesSet = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.println("namesSet : " + namesSet);

        List<String> namesList = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println("namesList : " + namesList);
    }
}
