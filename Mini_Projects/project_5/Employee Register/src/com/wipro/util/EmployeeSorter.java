package com.wipro.util;

import java.util.Comparator;
import com.wipro.bean.Employee;

public class EmployeeSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
    }
}
