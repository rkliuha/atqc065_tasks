package kmarko.oop_task;

public class Program {

    public static void main(String[] args) {

        final EmployeeFixedSalary boichenko = new EmployeeFixedSalary("Ira", 7, 'F', 10000);
        boichenko.printSalary();

        final EmployeeHourlySalary kondratuk = new EmployeeHourlySalary("Boris", 8, 'M', 5);
        kondratuk.calculateSalary();
        kondratuk.printSalary();
        kondratuk.setSalaryCoefficient(23.9);
        kondratuk.setWorkingHoursDay(9);
        kondratuk.calculateSalary();
        kondratuk.printSalary();
    }

}
