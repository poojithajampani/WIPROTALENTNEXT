package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentService {

    public String findGrades(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (student == null) {
            throw new NullStudentException();
        }

        if (student.name == null) {
            throw new NullNameException();
        }

        if (student.marks == null) {
            throw new NullMarksArrayException();
        }

        int total = 0;

        for (int mark : student.marks) {
            total += mark;
        }

        double average = total / (double) student.marks.length;

        if (average >= 80)
            return "A";
        else if (average >= 60)
            return "B";
        else if (average >= 40)
            return "C";
        else if (average >= 35)
            return "D";
        else
            return "F";
    }

    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.name == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.marks == null) {
                count++;
            }
        }

        return count;
    }
}