package main.java.kmarko.oop_task;

/**
 * Created by Kvita on 25.08.2016.
 */
public class Program {
    public static void main(String [] Args) {
        Employee_Fixed new_employee = new Employee_Fixed("Kika", 747367, 'F', 10000);
        new_employee.printSalary();

        Employee_Hourly brand_new_employee = new Employee_Hourly("Boris", 657498, 'M', 5);
        brand_new_employee.calculateSalary();
        brand_new_employee.printSalary();
    }

}
