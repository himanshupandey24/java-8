package org.learnjava.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> new Student(
            "Adam",
            2,
            3.6,
            "male",
            Arrays.asList("swimming", "basketball","volleyball"),
            11);

    public static Optional<Student> getOptionalStudent(){
        Student student = new Student("Adam",
                2,
                4.0,
                "male",
                Arrays.asList("swimming", "basketball","volleyball"));

        Bike bike = new Bike("Client123", "Client123");
        student.setBike(Optional.of(bike));
        return Optional.of(student);
    }

    public static List<Student> getStudents(){
        /**
         * 2nd grade students
         */
        Student student1 = new Student(
                "Adam",
                2,
                3.6,
                "male",
                Arrays.asList("swimming", "basketball","volleyball"),
                12);

        Student student2 = new Student(
                "Jenny",
                2,
                3.8,
                "female",
                Arrays.asList("swimming", "gymnastics","soccer"),
                13);

        /**
         * 3rd grade students
         */
        Student student3 = new Student(
                "Emily",
                3,
                4.0,
                "female",
                Arrays.asList("swimming", "gymnastics","aerobics"),
                14);

        Student student4 = new Student(
                "Dave",
                3,
                4.0,
                "male",
                Arrays.asList("swimming", "gymnastics","soccer"),
                15);
        /**
         * 4th grade students
         */
        Student student5 = new Student(
                "Sophia",
                4,
                3.5,
                "female",
                Arrays.asList("swimming", "dancing","football"),
                16);

        Student student6 = new Student(
                "James",
                4,
                3.9,
                "male",
                Arrays.asList("swimming", "basketball","baseball","football"),
                17);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);

        return students;
    }
}
