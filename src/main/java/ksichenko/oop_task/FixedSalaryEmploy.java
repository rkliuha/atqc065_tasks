package ksichenko.oop_task;

public class FixedSalaryEmploy extends Employees {

    protected int fixedSalary = 10000;

    public FixedSalaryEmploy(final String name, final String sex, final int id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        calculateAndPrintSalary();
    }

    public void calculateAndPrintSalary() {
        salary = fixedSalary;
    }
}
