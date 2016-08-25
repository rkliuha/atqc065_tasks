package rkliuha.oop_task;

public class HourRateSalaryEmployee extends Employee {

    private double hourRate;

    public HourRateSalaryEmployee(int id, String name, String sex, double hourRate) {
        super(id, name, sex);
        this.hourRate = hourRate;
        calculateSalary();
    }

    public void calculateSalary() {
        setSalary(20.8*8*hourRate);
    }
}
