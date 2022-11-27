package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> getStudentGradMap = (
            (studentList, studentPredicate) -> {
                Map<String, Double> studentGradMap = new HashMap<>();
                studentList.forEach(student -> {
                    if(studentPredicate.test(student)){
                        studentGradMap.put(student.getName(), student.getGpa());
                    }
                });
                return studentGradMap;
            });


    private static Map<String,String> loginPageLocs = new HashMap<>();

    public static String getLoginLocs(String sLocator, String elementType){
        return loginPageLocs.get(elementType);
    }

    static BiFunction<String, String, String> getLoginLocs = (sLocator, element) -> loginPageLocs.get(sLocator);


    public static void main(String[] args) {

        System.out.println(getStudentGradMap.apply(StudentDatabase.getStudents(), PredicateStudentExample.gpaGreaterThan_X));

    }
}
