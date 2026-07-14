import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<EmployeeDetails> employees = new Vector<>();

        employees.add(new EmployeeDetails(101, "Pooja", 45000));
        employees.add(new EmployeeDetails(102, "Rahul", 50000));
        employees.add(new EmployeeDetails(103, "Anjali", 55000));

        System.out.println("Using Iterator:");

        Iterator<EmployeeDetails> itr = employees.iterator();

        while (itr.hasNext()) {
            EmployeeDetails e = itr.next();
            e.display();
        }


        System.out.println("Using Enumeration:");

        Enumeration<EmployeeDetails> en = employees.elements();

        while (en.hasMoreElements()) {
            EmployeeDetails e = en.nextElement();
            e.display();
        }
    }
}
