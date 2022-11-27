package org.learnjava.methodReferences;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /**
     * Class::methodName
     */
    static Consumer<Student> printStudent = System.out::println;


    /**
     * instance::instancemethod
     */

    //Way 1
    static Consumer<Student> printActivities = student -> student.printListOfActivities();
    //Way 2
    static Consumer<Student> printActivities1 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDatabase.getStudents().forEach(printStudent);
        StudentDatabase.getStudents().forEach(printActivities);
        StudentDatabase.getStudents().forEach(printActivities1);
    }

}
