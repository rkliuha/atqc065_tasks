package rkliuha.oop_task;

public class FixedSalaryEmployee extends Employee {

    private final double fixedSalary;

    public FixedSalaryEmployee(final int id, final String name,
                               final String sex, final double fixedSalary) {
        super(id, name, sex);
        this.fixedSalary = fixedSalary;
        calculateSalary();
    }

    public FixedSalaryEmployee(final int id, final String name,
                               final String sex) {
        super(id, name, sex);
        fixedSalary = BASIC_FIXED_SALARY;
        calculateSalary();
    }

    public final void calculateSalary() {
        setSalary(fixedSalary);
    }

}
