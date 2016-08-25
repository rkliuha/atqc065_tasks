package main.java.kmarko.oop_task;

/**
 * Created by Kvita on 25.08.2016.
 */
public class Employee_Fixed extends Employee implements Salary  {

    Employee_Fixed (String n, int i, char s, double sal) {
        super(n, i, s, sal);
    }
    public double calculateSalary() {
        return salary;
    }

    public void printSalary() {
        System.out.println("Name " + name + " ID " + id + " Salary " + salary);

    }
}
