package ksichenko.oop_task;

public class HourRateSalary extends Employee {

    protected int hourRate;
    protected int workingPayed = 20;
    protected int workingDays = 8;

    public HourRateSalary(final String name, final String sex, final String salary, final int id, final int hourRate) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
        this.hourRate = hourRate;
    }

    public void calculateSalary() {
        double hourSalary = workingPayed * workingDays * hourRate;
        System.out.println("Employ salary amount: " + hourSalary);
    }
}
