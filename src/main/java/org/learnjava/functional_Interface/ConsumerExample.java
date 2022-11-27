package org.learnjava.functional_Interface;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c3 = student -> System.out.println(student);
    static Consumer<Student> c4 = student -> System.out.println(student.getName().toUpperCase());

    static Consumer<Student> c5 = student -> System.out.println(student.getActivities());

    static void printStudents(){
        List<Student> studentsList = StudentDatabase.getStudents();
        studentsList.forEach(c3);
        System.out.println();
        studentsList.forEach(student -> System.out.println(student));
    }

    static void printStudentNames(){
        List<Student> studentsList = StudentDatabase.getStudents();
        studentsList.forEach(student -> System.out.println(student.getName().toUpperCase()));
        System.out.println();
        studentsList.forEach(c4);
    }

    static void printActivities(){
        List<Student> studentsList = StudentDatabase.getStudents();
        studentsList.forEach(student -> System.out.println(student.getName() + " -> " + student.getActivities()));
        System.out.println();
        studentsList.forEach(c5);
    }

    static void printNameAndActivities(){
        List<Student> studentsList = StudentDatabase.getStudents();
        studentsList.forEach(c4.andThen(c5));
    }

    static void printNameAndActivitiesUsingConditions(){
        List<Student> studentList = StudentDatabase.getStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() > 3.9){
                c4.andThen(c5).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> c1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println("Old way of doing stuff");
            }
        };


        Consumer<String> c2 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java");
        c2.accept("java");
        printStudents();
        System.out.println("\nprintStudentNames\n");
        printStudentNames();
        System.out.println("\nprintActivities\n");
        printActivities();
        System.out.println("\nprintNameAndActivities\n");
        printNameAndActivities();
        System.out.println("\nprintNameAndActivitiesUsingConditions\n");
        printNameAndActivitiesUsingConditions();
    }

}
