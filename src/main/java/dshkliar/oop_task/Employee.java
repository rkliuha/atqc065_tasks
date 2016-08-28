package dshkliar.oop_task;

public abstract class Employee implements Salary {

    protected String name;
    protected char sex;
    protected int identifier;
    protected double salary;
    protected int hourRate;
    protected double rate;
    protected int hours;

    Employee(final int identifier, final String name, final char sex) {
        this.identifier = identifier;
        this.name = name;
        this.sex = sex;
    }

    abstract void printSalary();
}
