package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> getStudentGrade = (studentList -> {

        Map<String, Double> studentGradeMap = new HashMap<>();

        studentList.forEach(student -> {
            if(PredicateStudentExample.gpaGreaterThan_X.test(student))
                studentGradeMap.put(student.getName(), student.getGpa());
        });

        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(getStudentGrade.apply(StudentDatabase.getStudents()));
    }
}
