package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    private static String joining(){
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    private static String joiningWithDelimiter(){

        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }

    private static String joiningWithDelimiterWithPrefix(){
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("---->", "[", "]"));
    }
    public static void main(String[] args) {
        System.out.println("Names : "+ joining());
        System.out.println("Names With Delimiter : "+ joiningWithDelimiter());
        System.out.println("Names With Delimiter Prefix and Suffix : "+ joiningWithDelimiterWithPrefix());
    }
}
