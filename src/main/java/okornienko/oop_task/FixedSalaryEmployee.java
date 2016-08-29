package okornienko.oop_task;

public class FixedSalaryEmployee extends Employees {
    FixedSalaryEmployee(final int employeeId, final String employeeName, final String employeeSex, final double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeSalary = employeeSalary;
    }

    public final void calculateSalary() {
    }
}
