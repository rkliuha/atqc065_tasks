package dpapshev.oop_task.java_practice;
import dpapshev.oop_task.java_practice.Employee;


public class FixedSalaryEmployee extends Employee {

    FixedSalaryEmployee(final String name, final String sex, final int id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        calculateSalary();
    }


    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        this.salary = 10000.0;
    }
}







