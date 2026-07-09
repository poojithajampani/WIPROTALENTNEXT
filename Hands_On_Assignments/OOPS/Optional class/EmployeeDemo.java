import java.util.Optional;

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            System.out.println("Employee Name: " + employee.getName());

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
