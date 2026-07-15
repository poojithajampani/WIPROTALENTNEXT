import java.util.ArrayList;

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 25, "Pune"));
        employees.add(new Employee(102, "Priya", 30, "Hyderabad"));
        employees.add(new Employee(103, "Amit", 28, "Pune"));
        employees.add(new Employee(104, "Sneha", 26, "Chennai"));
        employees.add(new Employee(105, "Kiran", 32, "Pune"));

        ArrayList<Employee> puneEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getLocation().equalsIgnoreCase("Pune")) {
                puneEmployees.add(emp);
            }
        }

        System.out.println("Employees from Pune:");
        System.out.println("--------------------");

        for (Employee emp : puneEmployees) {
            emp.display();
        }
    }
}
