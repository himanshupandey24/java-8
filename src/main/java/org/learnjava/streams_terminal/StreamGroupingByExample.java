package org.learnjava.streams_terminal;

import com.sun.source.tree.UsesTree;
import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingByExample {

    private static void groupingByGender(){

        Map<String, List<Student>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        Stream.of(studentMap).forEach(System.out::println);
    }

    private static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        Stream.of(studentMap).forEach(System.out::println);

    }

    private static void twoLevelGrouping(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

        Stream.of(studentMap).forEach(System.out::println);
    }

    private static void twoLevelGrouping2(){
        Map<String, Integer> nameNoteBookMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(nameNoteBookMap);
    }

    private static void twoLevelGrouping3(){
        Map<String, Set<Student>> nameNoteBooksSet = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.toSet()));

        System.out.println(nameNoteBooksSet);
    }

    private static void threeArgumentGroupingBy(){
        LinkedHashMap<String, Set<Student>> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

        System.out.println(" studentMap : " + studentMap);
    }

    private static void calculateTopGpaStudentInEachGrade(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));

        Map<Integer, Student> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Student::getGpa)),
                                Optional::get)));

        Stream.of(studentMapOptional).forEach(System.out::println);
        System.out.println();
        Stream.of(studentMap).forEach(System.out::println);
    }

    private static void calculateLeastGpaStudentInEachGrade(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.minBy(Comparator.comparingDouble(Student::getGpa))));

        Map<Integer, Student> studentMap = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Student::getGpa)),
                                Optional::get)));

        Stream.of(studentMapOptional).forEach(System.out::println);
        System.out.println();
        Stream.of(studentMap).forEach(System.out::println);
    }




    public static void main(String[] args) {
        //groupingByGender();
        //customizedGroupingBy();
        //twoLevelGrouping();
        //twoLevelGrouping2();
        //twoLevelGrouping3();
        //threeArgumentGroupingBy();
        //calculateTopGpaStudentInEachGrade();
        calculateLeastGpaStudentInEachGrade();
    }
}
