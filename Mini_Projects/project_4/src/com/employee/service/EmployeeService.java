package com.employee.service;

import com.employee.bean.Employee;
import java.io.*;

public class EmployeeService {

    String fileName = "employee.txt";

    public void addEmployee(Employee emp) {

        try {

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(emp.getId() + "," + emp.getName() + "," +
                    emp.getAge() + "," + emp.getSalary());

            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void displayAll() {

        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            System.out.println("-----Report-----");

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println(data[0] + " " + data[1] + " " +
                        data[2] + " " + data[3]);
            }

            System.out.println("-----End of Report-----");

            br.close();

        } catch (Exception e) {
            System.out.println("No Employee Records Found");
        }
    }
}
