package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    private static Predicate<Student> gradeLevelGreaterThan3 = student -> student.getGradeLevel() >= 3;
    private static Predicate<Student> gpaGreaterThan4 = student -> student.getGpa() > 3.9;

    private static void filerStudentByGrade(){
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(student -> {
            if(gradeLevelGreaterThan3.test(student))
                System.out.println(student);
        });
    }

    private static void filerStudentByGpa(){
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(student -> {
            if(gpaGreaterThan4.test(student))
                System.out.println(student);
        });
    }

    private static void filerStudentByGrade_Gpa(){
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(student -> {
            if(gpaGreaterThan4.and(gradeLevelGreaterThan3).test(student))
                System.out.println(student);
        });
    }

    public static void main(String[] args) {
        filerStudentByGrade();
        System.out.println();
        filerStudentByGpa();
        System.out.println();
        filerStudentByGrade_Gpa();
    }
}
