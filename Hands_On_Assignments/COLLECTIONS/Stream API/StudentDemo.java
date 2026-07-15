import java.util.ArrayList;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 45));
        students.add(new Student(103, "Amit", 60));
        students.add(new Student(104, "Sneha", 38));
        students.add(new Student(105, "Kiran", 50));

        ArrayList<Student> passedStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getMark() >= 50) {
                passedStudents.add(student);
            }
        }

        System.out.println("Number of students who cleared the test: "
                + passedStudents.size());
    }
}
