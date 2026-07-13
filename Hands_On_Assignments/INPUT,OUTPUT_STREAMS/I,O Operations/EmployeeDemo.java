import java.io.*;
import java.util.Date;

public class EmployeeDemo {

    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee(
                "Pooja",
                new Date(),
                "IT",
                "Software Engineer",
                60000.0
        );

        // Serialization
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("data"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }

        // Deserialization
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("data"));

            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
