package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    private Predicate<Student> checkGradeLevel = student -> student.getGradeLevel() >= 3;
    private Predicate<Student> checkGpaLevel = student -> student.getGpa() >= 3.9;

    private BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name+ " " +activities);


    private Consumer<Student> studentConsumer = student -> {
        if(checkGpaLevel.and(checkGradeLevel).test(student)){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getStudents();
        new PredicateConsumerExample().printNameAndActivities(students);
    }
}
