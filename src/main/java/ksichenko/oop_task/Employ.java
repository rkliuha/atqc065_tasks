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

    public Employ(String employName, String sex, String salary, int id) {
        this.name = employName;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
    }
}
