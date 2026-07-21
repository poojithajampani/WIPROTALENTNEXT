package com.mile1.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentService;

public class StudentTest {

    private StudentService service;

    @Before
    public void setUp() {
        service = new StudentService();
    }

    // TC1 - Grade A
    @Test
    public void testGradeA() {
        Student s = new Student("Ram", new int[] {90, 90, 95});
        try {
            assertEquals("A", service.findGrades(s));
        } catch (Exception e) {
            fail();
        }
    }

    // TC2 - Grade D
    @Test
    public void testGradeD() {
        Student s = new Student("Ravi", new int[] {35, 36, 37});
        try {
            assertEquals("D", service.findGrades(s));
        } catch (Exception e) {
            fail();
        }
    }

    // TC3 - Grade F
    @Test
    public void testGradeF() {
        Student s = new Student("Kiran", new int[] {20, 25, 30});
        try {
            assertEquals("F", service.findGrades(s));
        } catch (Exception e) {
            fail();
        }
    }

    // TC4 - Null Student Object
    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {
        service.findGrades(null);
    }

    // TC5 - Null Name
    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[] {80, 70, 90});
        service.findGrades(s);
    }

    // TC6 - Null Marks Array
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarksArray() throws Exception {
        Student s = new Student("Rahul", null);
        service.findGrades(s);
    }

    // TC7 - Count Null Names
    @Test
    public void testFindNumberOfNullName() {

        Student[] students = {
            new Student(null, new int[] {80, 90}),
            new Student("A", new int[] {60, 70}),
            new Student(null, new int[] {50, 40})
        };

        assertEquals(2, service.findNumberOfNullName(students));
    }

    // TC8 - Count Null Objects
    @Test
    public void testFindNumberOfNullObjects() {

        Student[] students = {
            new Student("A", new int[] {80, 90}),
            null,
            new Student("B", new int[] {70, 60}),
            null
        };

        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    // TC9 - Count Null Marks Arrays
    @Test
    public void testFindNumberOfNullMarks() {

        Student[] students = {
            new Student("A", null),
            new Student("B", new int[] {60, 70}),
            new Student("C", null)
        };

        assertEquals(2, service.findNumberOfNullMarks(students));
    }
}