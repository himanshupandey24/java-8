package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    private static List<String> printAllStudentActivities(){
        List<String> studentActivities = StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        return studentActivities;
    }

    private static List<String> printAllDistinctStudentActivities(){
        List<String> studentActivities = StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List -> List.stream())
                .distinct()
                .collect(Collectors.toList());

        return studentActivities;
    }

    private static List<String> printAllDistinctSortedStudentActivities(){
        List<String> studentActivities = StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return studentActivities;
    }

    private static long getStudentActivitiesCount(){
        long totalActivities = StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;
    }


    public static void main(String[] args) {
        System.out.println(printAllStudentActivities());
        System.out.println();
        System.out.println(printAllDistinctStudentActivities());
        System.out.println();
        System.out.println(printAllDistinctSortedStudentActivities());
        System.out.println();
        System.out.println(getStudentActivitiesCount());
    }
}
