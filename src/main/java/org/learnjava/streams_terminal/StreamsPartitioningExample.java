package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningExample {

    private static void partitioningBy1(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println("\nStudentMap : " + studentMap);
    }

    public static void partitioningBy2(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean, Set<Student>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,Collectors.toSet()));

        System.out.println("\nStudentMap : " + studentMap);

    }

    public static void partitioningBy3(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,Map<String, List<String>>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate
                        ,Collectors.toMap(Student::getName,Student::getActivities)));

        System.out.println("\nStudentMap : " + studentMap);

    }


    public static void main(String[] args) {
        partitioningBy1();
        partitioningBy2();
        partitioningBy3();

    }
}
