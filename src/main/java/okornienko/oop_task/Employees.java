package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public abstract class Employees implements CalculateSalary {
    protected int employeeId;
    protected String employeeName;
    protected String employeeSex;
    protected double employeeSalary;



    final void printSalary() {
        System.out.println(employeeId + ". " + employeeName + ", " + employeeSex + ", " + employeeSalary);
    }

}

