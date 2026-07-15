public class Employee {

    private int empNo;
    private String name;
    private int age;
    private String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void display() {
        System.out.println("Employee No : " + empNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Location    : " + location);
        System.out.println();
    }
}
