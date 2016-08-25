package main.java.dshkliar.oop_task;

/**
 * Created by Dmytro on 025 25 08 2016.
 */
public class Main {
    public static void main(String[] args){
        EmployeeWithHourRate empH1 = new EmployeeWithHourRate(111, "Vasia", 'm', 10);
        System.out.println("\nEmployee With Hour Rate: ");
        empH1.printSalary();
        EmployeeWithFixedSalary empF1 = new EmployeeWithFixedSalary(222, "Ira", 'f', 10000.0);
        System.out.println("\nEmployee With Fixed Salary: ");
        empF1.printSalary();
    }
}
