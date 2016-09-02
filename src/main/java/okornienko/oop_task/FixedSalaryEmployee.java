package okornienko.oop_task;

class FixedSalaryEmployee extends Employee {
    private final double fixedSalary;
    private final double bonusSalary;

    FixedSalaryEmployee(final int employeeId, final String employeeName, final String employeeSex,
                        final double fixedSalary, final double bonusSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.fixedSalary = fixedSalary;
        this.bonusSalary = bonusSalary;
    }

    public final void calculateSalary() {
        employeeSalary = fixedSalary + bonusSalary;
    }
}
