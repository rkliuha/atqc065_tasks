package ksichenko.oop_task;

public class Action {

    public static void main(String[] args) {

        final Employ ksichenko = new FixedSalaryEmploy("Sichenko", "male", "fixed", 1);

        final Employ kmarko = new HourRateSalary("Marko", "female", "hourRate", 4, 30);

        ksichenko.printSalary();
        ksichenko.calculateSalary();

        kmarko.printSalary();
        kmarko.calculateSalary();

    }
}