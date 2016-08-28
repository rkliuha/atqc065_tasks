package dpapshev.oop_task;


public class HourRateEmployee extends Employee {
    private double hourRate;
    private int workingHoursPerDay;
    private double salaryFormingFactor;

    HourRateEmployee(final String name, final String sex, int id, double hourRate) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.hourRate = hourRate;
        this.workingHoursPerDay = 8;
        this.salaryFormingFactor = 20.8;
        calculateSalary();
    }

    public void setWorkingHoursPerDay(final int workingHoursPerDay) {
        this.salaryFormingFactor = salaryFormingFactor;
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public void setSalaryFormingFactor(final double salaryFormingFactor) {
        this.salaryFormingFactor = salaryFormingFactor;
    }

    public double getSalaryFormingFactor() {
        return salaryFormingFactor;
    }


    public void calculateSalary() {
        this.salary = salaryFormingFactor * workingHoursPerDay * hourRate;
    }
}
