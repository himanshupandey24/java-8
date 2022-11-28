package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.function.Predicate;

public class StreamFilterMapReduce {
    static Predicate<Student> genderPredicate = student -> student.getGender().equals("male");
    static Predicate<Student> gradeLevel = student -> student.getGradeLevel() == 2.0;

    private static int noOfNoteBooks(){
        int totalNoteBooks = StudentDatabase.getStudents()
                .stream()
                .filter(gradeLevel)
                .peek(student -> System.out.println(student))
                .map(Student::getNoteBooks)
                .peek(ele -> System.out.println(ele))
                .reduce(0, Integer::sum);

        return totalNoteBooks;
    }

    public static void main(String[] args) {
        System.out.println("Total No of Notebooks are : " + noOfNoteBooks());
    }
}
