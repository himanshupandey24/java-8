package org.learnjava.methodReferences;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> checkGrade = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> checkGradeMethRef = RefactorMethodReferenceExample::checkGrades;

    static BiPredicate<Student, Integer> checkGradeWithGivenGrade = RefactorMethodReferenceExample::gradeGreaterThan;

    public static boolean checkGrades(Student student){
        return student.getGradeLevel() > 3;
    }

    static public  boolean gradeGreaterThan(Student student,Integer grade){
        return student.getGradeLevel() > grade;
    }

    public static void main(String[] args) {
        System.out.println(checkGrade.test(StudentDatabase.studentSupplier.get()));
        System.out.println(checkGradeMethRef.test(StudentDatabase.studentSupplier.get()));
        System.out.println(checkGradeWithGivenGrade.test(StudentDatabase.studentSupplier.get(), 3));
    }
}
