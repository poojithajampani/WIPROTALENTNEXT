import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        // Creating HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<String>();

        // Adding employee names
        employeeNames.add("John");
        employeeNames.add("Priya");
        employeeNames.add("Rahul");
        employeeNames.add("Anitha");
        employeeNames.add("Kiran");

        // Creating Iterator
        Iterator<String> iterator = employeeNames.iterator();

        // Retrieving elements one by one
        System.out.println("Employee Names:");

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
