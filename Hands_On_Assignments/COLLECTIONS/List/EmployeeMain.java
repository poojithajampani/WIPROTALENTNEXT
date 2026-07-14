public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Pooja", "pooja@gmail.com", "Female", 45000);
        Employee e2 = new Employee(102, "Rahul", "rahul@gmail.com", "Male", 50000);
        Employee e3 = new Employee(103, "Anjali", "anjali@gmail.com", "Female", 55000);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Employee Details");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(102));

        System.out.println();

        if (db.deleteEmployee(101))
            System.out.println("Employee Deleted Successfully");
        else
            System.out.println("Employee Not Found");

        System.out.println();

        System.out.println("Employee Details After Deletion");
        db.showAllEmployees();
    }
}
