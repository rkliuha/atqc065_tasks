package rkliuha.oop_task;

public class Main {

    public static void main(String[] args) {
        Employee ahmed = new HourRateSalaryEmployee(1, "Ahmed", "Male", 30);
        Employee irvin = new FixedSalaryEmployee(2, "Irvin", "Male");
        Employee izabella = new HourRateSalaryEmployee(3, "Izabella", "Female", 50);

        ahmed.printSalary();
        irvin.printSalary();
        izabella.printSalary();
    }
}
