package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student data[] = new Student[4];

        data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        data[1] = new Student(null, new int[] { 11, 22, 33 });
        data[2] = new Student("Manoj", null);
        data[3] = null;

        StudentReport report = new StudentReport();

        for (int i = 0; i < data.length; i++) {
            try {
                report.validate(data[i]);
                System.out.println(data[i].getName() + " Grade : "
                        + report.findGrades(data[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();

        System.out.println("Number of Null Mark Arrays : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}
