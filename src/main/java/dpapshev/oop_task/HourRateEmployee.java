package dpapshev.oop_task;


public class HourRateEmployee extends Employee {
    private double hourRate;
    private int workingHours;
    private double workingDays;

    HourRateEmployee(final String name, final String sex, int id, double hourRate) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.hourRate = hourRate;
        this.workingHours = 8;
        this.workingDays = 20.8;
        calculateSalary();
    }

    public void setWorkingHours(final int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingDays(final double workingDays) {
        this.workingDays = workingDays;
    }

    public double getWorkingDays() {
        return workingDays;
    }


    public void calculateSalary() {
        this.salary = workingDays * workingHours * hourRate;
    }
}
