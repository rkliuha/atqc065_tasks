package ksichenko.oop_task;

public class Action {

    public static void main(String[] args) {

        final Employees ksichenko = new FixedSalaryEmploy("Sichenko", "male", 1);

        final Employees kmarko = new HourRateSalary("Marko", "female", 4, 30);

        ksichenko.printSalary();
        kmarko.printSalary();


    }
}