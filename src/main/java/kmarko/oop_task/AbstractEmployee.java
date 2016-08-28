package kmarko.oop_task;

public abstract class AbstractEmployee {

    protected String name;
    protected int identifier;
    protected char sex;
    protected double hourRate;
    protected double salary;

    protected abstract void printSalary();

}
