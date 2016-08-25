package dpapshev.oop_task;


public class Test {
    public static void Main(String[] args){

        Employee max = new HourRateEmployee("Max","male",12,34);
        Employee bob = new FixedSalaryEmployee("Bob","male",10);
        bob.printSalary();
        max.printSalary();

    }
}
