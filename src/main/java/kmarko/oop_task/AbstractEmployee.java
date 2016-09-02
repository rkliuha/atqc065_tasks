package kmarko.oop_task;

public abstract class AbstractEmployee implements Comparable<AbstractEmployee> {

    protected String name;
    protected int identifier;
    protected char sex;
    protected double hourRate;
    protected double salary;

    protected abstract void printSalary();

    @Override
    final public String toString() {
        return "Employee: " +
                "name='" + name + '\'' +
                ", identifier=" + identifier +
                ", sex=" + sex +
                ", hourRate=" + hourRate +
                ", salary=" + salary;
    }

    final public int compareTo(AbstractEmployee employee1) {
        double compareSalary = employee1.salary - salary;
        if (compareSalary != 0) {
            return (int) compareSalary;
        } else {
            compareSalary = name.compareTo(employee1.name);
        }
        if (compareSalary != 0) {
            return (int) compareSalary;
        } else {
            return  0;
        }
    }
}
