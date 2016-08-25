package ksichenko.oop_task;

/**
 * Created by macbook on 8/25/16.
 */
public class HourRateSalary extends Employ {

    public HourRateSalary(String name, String sex, int salary, int id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    void calculateSalary() {
        salary = 0.8 * 8 * 10;
        System.out.println("Employ salary amount: " + salary);
    }
}
