class Employee implements Cloneable {
    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Original object
        Employee emp1 = new Employee(101, "Rohit", 50000);

        // Clone object
        Employee emp2 = (Employee) emp1.clone();

        // Modify original object
        emp1.empId = 102;
        emp1.empName = "Rahul";
        emp1.salary = 60000;

        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("\nCloned Employee:");
        emp2.display();
    }
}