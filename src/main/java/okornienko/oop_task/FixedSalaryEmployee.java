package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public class FixedSalaryEmployee extends Employees {
    FixedSalaryEmployee(int employeeId, String employeeName, String employeeSex){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;

    }
    double calculateSalary(){
        return  employeeSalary = 10000;
    };

}
