package rkliuha.oop_task;

public abstract class Employee implements SalaryCalculator {

    private final int id;
    private final String name;
    private final String sex;
    private double salary;

    public Employee(final int id, final String name, final String sex) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public final void printSalary() {
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee sex: " + getSex());
        System.out.println("Employee salary: " + getSalary() + "$\n");
    }

    @Override
    public final String toString() {
        return "Id: " + getId() + "\tName: " + getName()
                + "\tSex: " + getSex() + "\tSalary: " + getSalary();
    }

    public final String getName() {
        return name;
    }

    public final String getSex() {
        return sex;
    }

    public final int getId() {
        return id;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(final double salary) {
        this.salary = salary;
    }

}
