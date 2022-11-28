package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;

public class StudentReduceExample {

    private static int performMultiplication(List<Integer> integerList){
        return integerList
                .stream()
                .reduce(1,(a,b) -> a*b);
    }

    private static String combineStudents(){
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .distinct()
                .reduce("", String::concat); // or .reduce("", (s1, s2) -> s1.concat(s2) );
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7,9);
        System.out.println(performMultiplication(integerList));
        System.out.println("\n" + combineStudents());
    }
}
