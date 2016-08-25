package ksichenko.oop_task;

/**
 * Created by macbook on 8/25/16.
 */
public class HourRateSalary extends Employ {

    public HourRateSalary(String employName, String sex, String salary, int id) {
        super(employName, sex, salary, id);
    }

    void calculateSalary() {
        double salary = 0.8 * 8 * 10;
        System.out.println("Employ salary amount: " + salary);
    }
}
