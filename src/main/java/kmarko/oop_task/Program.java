package kmarko.oop_task;

public class Program {

    public static void main(String[] args) {

        EmployeeFixedSalary kit = new EmployeeFixedSalary("Ira", 7, 'F', 10000);
        kit.printSalary();

        EmployeeHourlySalary vit = new EmployeeHourlySalary("Boris", 8, 'M', 5);
        vit.calculateSalary();
        vit.printSalary();
        vit.setSalaryCoefficient(23.9);
        vit.setWorkingHoursDay(9);
        vit.calculateSalary();
        vit.printSalary();
    }

}
