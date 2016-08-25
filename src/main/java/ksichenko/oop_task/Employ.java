package ksichenko.oop_task;

import java.io.PrintStream;

abstract class Employ {

    protected String name;
    protected String sex;
    protected String salary;
    protected int id;

    public void printSalary() {
        System.out.println("Employ name: " + name);
        System.out.println("Employ salary: " + salary);
        System.out.println("Employ id: " + id);
    }

    abstract void calculateSalary();

}
