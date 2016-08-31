package ksichenko.oop_task;

public class HourRateSalary extends Employees {

    protected int hourRate = 0;
    protected int workingPayed = 20;
    protected int workingDays = 8;

    public HourRateSalary(final String name, final String sex, final int id, final int hourRate) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.hourRate = hourRate;
        calculateAndPrintSalary();
    }

    public void calculateAndPrintSalary() {
        salary = workingPayed * workingDays * hourRate;
    }
}
