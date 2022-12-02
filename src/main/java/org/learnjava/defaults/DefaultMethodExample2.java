package org.learnjava.defaults;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
    static Comparator<Student> genderComparator = Comparator.comparing(Student::getGender);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    static Consumer<Student> studentConsumer = student -> System.out.println("Student : " + student);

    private static void sortByName(List<Student> studentList){
        studentList.sort(Comparator.comparing(Student::getName)); //inline
        studentList.sort(nameComparator); // Using a reference
        System.out.println("\nAfter Sort BY Name : ");
        studentList.forEach(studentConsumer);
    }
    private static void sortByGPA(List<Student> studentList){
        studentList.sort(gpaComparator);
        System.out.println("\nAfter sort BY GPA : ");
        studentList.forEach(studentConsumer);
    }

    private static void sortByGender(List<Student> studentList){
        Comparator<Student> nullLast = Comparator.nullsLast(genderComparator);
        studentList.sort(nullLast);
        System.out.println("\nAfter Sort By Gender : ");
        studentList.forEach(studentConsumer);

    }

    private static void comparatorChaining(List<Student> studentList){
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println("\nComparator Chaining List");
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getStudents();
        System.out.println("Original List");
        studentList.forEach(System.out::println);
        sortByGender(studentList);
        sortByGPA(studentList);
        sortByName(studentList);
        comparatorChaining(studentList);
    }
}
