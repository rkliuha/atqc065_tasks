package rkliuha.oop_task;

public class HourRateSalaryEmployee extends Employee {

    private final double mainRate;
    private final double bonusRate;
    private final double hourRate;

    public HourRateSalaryEmployee(final int id, final String name,
                                  final String sex, final double basicRate,
                                  final double hourRate,
                                  final double bonusRate) {
        super(id, name, sex);
        this.hourRate = hourRate;
        this.mainRate = basicRate;
        this.bonusRate = bonusRate;
        calculateSalary();
    }

    public HourRateSalaryEmployee(final int id, final String name,
                                  final String sex, final double hourRate) {
        super(id, name, sex);
        this.hourRate = hourRate;
        bonusRate = BASIC_BONUS_RATE;
        mainRate = BASIC_MAIN_RATE;
        calculateSalary();
    }

    public final void calculateSalary() {
        setSalary(mainRate * bonusRate * hourRate);
    }
}
