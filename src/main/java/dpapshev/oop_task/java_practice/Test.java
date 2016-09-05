package dpapshev.oop_task.java_practice;


import dpapshev.oop_task.java_practice.Employee;
import dpapshev.oop_task.java_practice.FixedSalaryEmployee;
import dpapshev.oop_task.java_practice.HourRateEmployee;


class Test {
    public static void main(String[] args) {

        final Employee max = new HourRateEmployee("Max", "male", 12, 34);
        final Employee bob = new FixedSalaryEmployee("Bob", "male", 10);
        bob.printSalary();
        max.printSalary();
    }
}
