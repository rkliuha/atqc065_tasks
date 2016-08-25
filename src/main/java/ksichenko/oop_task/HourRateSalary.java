package ksichenko.oop_task;

/**
 * Created by macbook on 8/25/16.
 */
public class HourRateSalary extends Employ {

    public HourRateSalary(String name, String sex, String salary, int id) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
    }

    void calculateSalary() {
       double salary = 0.8 * 8 * 1000;
        System.out.println("Employ salary amount: " + salary);
    }
}
