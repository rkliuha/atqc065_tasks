package main.java.kmarko.oop_task;

/**
 * Created by Kvita on 25.08.2016.
 */
public class Employee_Hourly extends Employee implements Salary {

    Employee_Hourly (String n, int i, char s, int h) {
        super(n, i, s, h);
    }

    public double calculateSalary() {
        salary=20.8*8*hour_rate;
        return salary;
    }

    public void printSalary() {
        System.out.println("Name " + name + " ID " + id + " Salary " + salary);

    }
}
