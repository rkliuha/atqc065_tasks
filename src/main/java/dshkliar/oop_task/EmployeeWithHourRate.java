package dshkliar.oop_task;

public class EmployeeWithHourRate extends Employee {

    EmployeeWithHourRate(final int identifier, final String name,
                         final char sex, final int hourRate,
                         final double rate, final int hours) {
        super(identifier, name, sex);
        this.hourRate = hourRate;
        this.rate = rate;
        this.hours = hours;
    }

    final public double calculateSalary() {
        salary = rate * hours * hourRate;
        return salary;
    }

    final void printSalary() {
        System.out.println("\nInfomation for Employee With Hour Rate: ");
        System.out.println("\tname: " + name + ";\n\tsex: " + sex
                + ";\n\tID: " + identifier + ";\n\tsalary: "
                + calculateSalary());
    }
}
