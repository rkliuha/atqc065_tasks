package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public class HourRateEmployee extends Employees {
int hourRate;
    HourRateEmployee(int employeeId, String employeeName, String employeeSex, int hourRate){
        this.hourRate = hourRate;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
    }
    double calculateSalary(){
        return employeeSalary = 20.8*8*hourRate;
    };
}

