package ksichenko.oop_task;

public class FixedSalaryEmploy extends Employee {

    protected int fixedSalary = 10000;

    public FixedSalaryEmploy(final String name, final String sex, final String salary, final int id) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
    }

    public void calculateSalary() {
        System.out.println("Employ salary amount: " + fixedSalary);
    }
}
