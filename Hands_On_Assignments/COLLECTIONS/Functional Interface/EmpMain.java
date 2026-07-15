import java.util.ArrayList;
import java.util.function.Predicate;

public class EmpMain {

    public static void main(String[] args) {

        ArrayList<Emp> list = new ArrayList<>();

        list.add(new Emp(101, "Rahul", 9000));
        list.add(new Emp(102, "Priya", 15000));
        list.add(new Emp(103, "Amit", 8500));
        list.add(new Emp(104, "Sneha", 12000));
        list.add(new Emp(105, "Kiran", 7000));

        Predicate<Emp> salaryCheck = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Emp emp : list) {
            if (salaryCheck.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}
