package rkliuha.oop_task;

public abstract class Employee {

    private int id;
    private String name;
    private String sex;
    private double salary;

    public Employee(int id, String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public void printSalary() {
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee sex: " + getSex());
        System.out.println("Employee salary: " + getSalary());
        System.out.println();
    }

    public abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
