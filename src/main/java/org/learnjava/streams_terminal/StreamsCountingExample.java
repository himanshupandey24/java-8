package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    private static long count(){
        return StudentDatabase.getStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());

        //StudentDatabase.getStudents().stream().filter(student -> student.getGpa() >= 3.9).count();
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
