package dpapshev.oop_task;


abstract class Employee implements SalaryCalculator {
    protected String name;
    protected String sex;
    protected int id;
    protected double salary;

    public void printSalary() {
        System.out.println("Employee: " + name + " Id# " + id + " Salary: " + salary);
    }
}
