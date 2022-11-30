package org.learnjava.streams_terminal;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    private static int sum(){
        int totalNoOfNotebooks = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        System.out.println("Total no of Notebooks : " + StudentDatabase.getStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .sum());
        System.out.println("Total no of Notebooks : " + StudentDatabase.getStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce((a,b) -> a+b));
        return totalNoOfNotebooks;
    }

    private static double average(){

        double averageNoOfNotebooks = StudentDatabase.getStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));

        System.out.println("Average no of Notebooks : " + StudentDatabase.getStudents()
                .stream()
                .mapToDouble(Student::getNoteBooks)
                .average());
        return averageNoOfNotebooks;
    }
    public static void main(String[] args) {
        System.out.println("Total no of Notebooks : " + sum());
        System.out.println("Average no of Notebooks : " + average());
    }
}
