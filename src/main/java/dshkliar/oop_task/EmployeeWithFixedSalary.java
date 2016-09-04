package dshkliar.oop_task;

public class EmployeeWithFixedSalary extends Employee {

    EmployeeWithFixedSalary(final int identifier, final String name,
                            final char sex, final double salary) {
        super(identifier, name, sex);
        this.salary = salary;
    }

    final public double getCalculatedSalary() {
        return salary;
    }

    final void printSalary() {
        System.out.println("\nInfomation for Employee With Fixed Price: ");
        System.out.println("\tname: " + name + ";\n\tsex: " + sex
                + ";\n\tID: " + identifier + ";\n\tsalary: "
                + getCalculatedSalary());
    }
}
