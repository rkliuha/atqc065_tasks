package rkliuha.oop_task;

public class FixedSalaryEmployee extends Employee {


    public FixedSalaryEmployee(int id, String name, String sex) {
        super(id, name, sex);
        calculateSalary();
    }

    public void calculateSalary() {
        setSalary(10000);
    }
}
