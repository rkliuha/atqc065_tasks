package dpapshev.oop_task;


public class FixedSalaryEmployees extends Employee {

    FixedSalaryEmployees(final String name, final String sex, int id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        calculateSalary();
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }


    public void calculateSalary() {
        this.salary = 10000;
    }
}

