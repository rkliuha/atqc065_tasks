package main.java.dshkliar.oop_task;

/**
 * Created by Dmytro on 025 25 08 2016.
 */
public class EmployeeWithHourRate extends Employee implements Salary {

    EmployeeWithHourRate(){
        super();
    }

    EmployeeWithHourRate(int id, String name, char sex, int hourRate) {
        super(id, name, sex, hourRate);
    }

    public double calculateSalary() {
        salary = 20.8 * 8 * hour_rate;
        return salary;
    }

    public void printSalary() {
        System.out.println("\tname: " + name + ";\n\tsex: " + sex + ";\n\tID: " + id + ";\n\tsalary: " + calculateSalary());
    }
}
