package okornienko.oop_task;


public abstract class Employee implements CalculateSalary {
    int employeeId;
    String employeeName;
    String employeeSex;
    double employeeSalary;

    final void printSalary() {
        System.out.println(employeeId + ". " + employeeName + ", " + employeeSex + ", " + employeeSalary);
    }

    final int getEmployeeId() {
        return employeeId;
    }

    final String getEmployeeName() {
        return employeeName;
    }

    final String getEmployeeSex() {
        return employeeSex;
    }

    final double getEmployeeSalary() {
        return employeeSalary;
    }
}
