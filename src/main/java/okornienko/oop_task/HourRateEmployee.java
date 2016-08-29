package okornienko.oop_task;

public class HourRateEmployee extends Employees {
    private double hourRate;
    private double hours;
    private double days;

    HourRateEmployee(final int employeeId, final String employeeName, final String employeeSex,
                     final double hourRate, final double hours, final double days) {
        this.hourRate = hourRate;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.hours = hours;
        this.days = days;
    }

    public final void calculateSalary() {
        employeeSalary = days * hours * hourRate;
    }
}

