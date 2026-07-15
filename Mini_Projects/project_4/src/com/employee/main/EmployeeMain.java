package com.employee.main;

import java.util.Scanner;
import com.employee.bean.Employee;
import com.employee.service.EmployeeService;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Employee emp = new Employee();

                System.out.print("Enter Employee ID : ");
                emp.setId(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter Employee Name : ");
                emp.setName(sc.nextLine());

                System.out.print("Enter Employee Age : ");
                emp.setAge(sc.nextInt());

                System.out.print("Enter Employee Salary : ");
                emp.setSalary(sc.nextDouble());

                service.addEmployee(emp);

                break;

            case 2:

                service.displayAll();
                break;

            case 3:

                System.out.println("Exiting the System...");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
