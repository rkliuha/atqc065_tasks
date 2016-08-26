package ksichenko.oop_task;

public class HourRateSalary extends Employ {

    protected int hourRate;

    public HourRateSalary(String name, String sex, String salary, int id, int hourRate) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
        this.hourRate = hourRate;
    }

    public void calculateSalary() {
        double hourSalary = 20 * 8 * hourRate;
        System.out.println("Employ salary amount: " + hourSalary);
    }
}
