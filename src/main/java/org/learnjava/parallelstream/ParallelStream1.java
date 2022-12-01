package org.learnjava.parallelstream;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream1 {

    private static List<String> sequentialStream(){
        long start = System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        long duration = System.currentTimeMillis() - start;

        System.out.println("Duration in sequential stream : "+ duration);
        return studentActivities;

    }


    private static List<String> parallelStream(){
        long start = System.currentTimeMillis();

        List<String> studentActivities = StudentDatabase.getStudents()
                .parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        long duration = System.currentTimeMillis() - start;

        System.out.println("Duration in parallel stream : "+ duration);

        return studentActivities;
    }
    public static void main(String[] args) {
        System.out.println("sequentialStream : " + sequentialStream());
        System.out.println("parallelStream : " + parallelStream());
    }
}
