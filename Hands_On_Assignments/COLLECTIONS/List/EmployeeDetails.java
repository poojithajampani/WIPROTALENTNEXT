public class EmployeeDetails {

    int empId;
    String empName;
    float salary;

    public EmployeeDetails(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}
