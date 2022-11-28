package org.learnjava.streams;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    private static int performMultiplication(List<Integer> integerList){
        return integerList
                .stream()
                .reduce(1,(a,b) -> a*b);
    }

    private static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList
                .stream()
                .reduce((a,b) -> a*b);
    }

    private static String combineStudents(){
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getName)
                .distinct()
                .reduce("", String::concat); // or .reduce("", (s1, s2) -> s1.concat(s2) );
    }

    private static Optional<Student> getHighestGradeStudent(){
        Optional<Student> studentOptional = StudentDatabase.getStudents()
                .stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
        return studentOptional;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7,9);
        System.out.println(performMultiplication(integerList));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integerList);
        if(result.isPresent()){
            System.out.println("Result is : " + result.get());
        }
        else{
            System.out.println("Result is : " + 0);
        }

        System.out.println("\n" + combineStudents());
        System.out.println("\n" + getHighestGradeStudent().get());

    }
}
