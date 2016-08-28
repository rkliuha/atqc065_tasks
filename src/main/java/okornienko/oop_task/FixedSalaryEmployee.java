package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public class FixedSalaryEmployee extends Employees  {
    FixedSalaryEmployee(int employeeId, String employeeName, String employeeSex, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeSalary = employeeSalary;
    }

  public final double calculateSalary() {
        return employeeSalary;
    }

}
