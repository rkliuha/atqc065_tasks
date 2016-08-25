package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public abstract class Employees {
    int employeeId;
    String employeeName;
    String employeeSex;
    double employeeSalary;
   abstract double calculateSalary();
    void printSalary(){
        System.out.println(employeeId + ". " + employeeName + ", " + employeeSex+  ", " + employeeSalary);
    };
}

