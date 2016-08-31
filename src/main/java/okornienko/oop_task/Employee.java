package okornienko.oop_task;

import java.util.Comparator;

public abstract class Employee implements CalculateSalary {
    int employeeId;
    String employeeName;
    String employeeSex;
    double employeeSalary;

    final void printSalary() {
        System.out.println(employeeId + ". " + employeeName + ", " + employeeSex + ", " + employeeSalary);
    }

    final int getemployeeId() {
        return employeeId;
    }

    final String getemployeeName() {
        return employeeName;
    }

    final String getemployeeSex() {
        return employeeSex;
    }

    final double getemployeeSalary() {
        return employeeSalary;
    }
}
