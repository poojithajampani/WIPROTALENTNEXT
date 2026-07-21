package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student("Pooja", new int[] {85, 90, 80});
        Student s2 = new Student("Rahul", new int[] {35, 36, 34});
        Student s3 = new Student("Anu", new int[] {20, 25, 30});

        Student[] students = { s1, s2, s3, null, new Student(null, new int[] {60, 70, 80}),
                new Student("Ravi", null) };

        try {
            System.out.println(s1.name + " Grade : " + service.findGrades(s1));
            System.out.println(s2.name + " Grade : " + service.findGrades(s2));
            System.out.println(s3.name + " Grade : " + service.findGrades(s3));
        } catch (NullStudentException | NullNameException | NullMarksArrayException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(students));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullName(students));

        System.out.println("Number of Null Marks Arrays : "
                + service.findNumberOfNullMarks(students));
    }
}