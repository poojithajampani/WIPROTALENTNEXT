import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", "Pune", 45000));
        employees.add(new Employee(102, "Priya", "Hyderabad", 50000));
        employees.add(new Employee(103, "Amit", "Chennai", 55000));
        employees.add(new Employee(104, "Sneha", "Pune", 60000));
        employees.add(new Employee(105, "Kiran", "Bangalore", 48000));

        Function<Employee, String> getLocation = emp -> emp.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Employee Locations:");
        for (String location : locations) {
            System.out.println(location);
        }
    }
}
