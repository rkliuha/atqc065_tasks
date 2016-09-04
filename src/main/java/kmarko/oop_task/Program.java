package kmarko.oop_task;

import org.testng.annotations.Test;

public class Program {

    public static void main(String[] args) {

        final EmployeeFixedSalary boichenko = new EmployeeFixedSalary("Ira", 7, 'F', 10000);
        boichenko.printSalary();

        final EmployeeHourlySalary kondratuk = new EmployeeHourlySalary("Boris", 11, 'M', 5);
        kondratuk.getCalculatedSalary();
        kondratuk.printSalary();
        kondratuk.setSalaryCoefficient(23.9);
        kondratuk.setWorkingHoursDay(9);
        kondratuk.getCalculatedSalary();
        kondratuk.printSalary();
    }
}
