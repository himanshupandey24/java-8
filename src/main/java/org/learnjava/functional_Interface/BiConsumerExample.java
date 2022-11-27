package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    private static void namesAndActivities(){
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " " + activities);
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(student -> studentBiConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a: " + a + ", b : " + b );
        biConsumer.accept("java17", "java19");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication is : " + a*b);
        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("Division is: " + a/b);
        BiConsumer<Integer, Integer> addition = (a,b) -> System.out.println("Addition is: "+ (a+b));
        BiConsumer<Integer, Integer> subtraction = (a,b) -> System.out.println("Subtraction is:" + (a-b));

        multiply.andThen(division).andThen(addition).andThen(subtraction).accept(15,7);
        System.out.println();
        namesAndActivities();
    }
}
