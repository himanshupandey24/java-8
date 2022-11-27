package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    private static BiPredicate<Integer, Double> filterByGrade_Gpa = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    private static Consumer<Student> printStudentFilterByGrade_Gpa = student -> {
        if(filterByGrade_Gpa.test(student.getGradeLevel(), student.getGpa()))
            System.out.println(student);
    };
    private static void filterStudents(){
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(printStudentFilterByGrade_Gpa);
    }
    public static void main(String[] args) {
        filterStudents();
    }
}
