package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public class HourRateEmployee extends Employees  {
    private double hourRate;
    private double hours;
    private double days;

    HourRateEmployee(int employeeId, String employeeName, String employeeSex, double hourRate, double hours, double days) {
        this.hourRate = hourRate;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.hours = hours;
        this.days = days;
    }

   public final double calculateSalary() {
       employeeSalary = days * hours * hourRate;
       return employeeSalary;
    }

    ;
}

