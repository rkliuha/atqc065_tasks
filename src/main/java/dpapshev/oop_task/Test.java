package dpapshev.oop_task;


import java.util.*;


class Test {
    public static void main(String[] args) {

        final Employee max = new HourRateEmployee("Max", "male", 12, 34);
        final Employee bob = new FixedSalaryEmployee("Bob", "male", 10);
        bob.printSalary();
        max.printSalary();
    }
}
