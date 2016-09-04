package dpapshev.oop_task;


class Test {
    public static void Main(String[] args) {

        Employee max = new HourRateEmployees("Max", "male", 12, 34);
        Employee bob = new FixedSalaryEmployees("Bob", "male", 10);
        bob.printSalary();
        max.printSalary();

    }
}
