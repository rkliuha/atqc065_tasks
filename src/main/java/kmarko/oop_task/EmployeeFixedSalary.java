package kmarko.oop_task;

public class EmployeeFixedSalary extends AbstractEmployee implements Salary {

    EmployeeFixedSalary(final String name, final int identifier,
                        final char sex, final double salary) {

        this.name = name;
        this.identifier = identifier;
        this.sex = sex;
        this.salary = salary;
    }

    final public double getCalculatedSalary() {
        return salary;
    }

    final public void printSalary() {
        System.out.println("Name: " + name + " ID: "
                            + identifier + " Salary: " + salary);

    }
}
