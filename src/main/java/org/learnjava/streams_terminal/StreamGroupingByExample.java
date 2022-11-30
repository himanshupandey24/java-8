package org.learnjava.streams_terminal;

import com.sun.source.tree.UsesTree;
import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
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
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(nameNoteBookMap);
    }


    public static void main(String[] args) {
        //groupingByGender();
        //customizedGroupingBy();
        //twoLevelGrouping();
        //twoLevelGrouping2();
    }
}
