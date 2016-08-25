package ksichenko.oop_task;

public class Action {

    public static void main(String[] args) {

        Employ ksichenko = new FixedSalaryEmploy("Sichenko", "male", "fixed", 1);
        Employ dpapshev = new FixedSalaryEmploy("Papshev", "male", "fixed", 2);
        Employ dshkliar = new FixedSalaryEmploy("Shkliar", "male", "fixed", 3);

        Employ kmarko = new HourRateSalary("Marko", "female", "hourRate", 4);
        Employ okornienko = new HourRateSalary("Kornienko", "male", "hourRate", 4);
        Employ rkliuha = new HourRateSalary("Kkliuha", "male", "hourRate", 4);

        ksichenko.calculateSalary();
        ksichenko.printSalary();

        kmarko.calculateSalary();
        kmarko.printSalary();
    }
}
