package ksichenko.oop_task;

public class FixedSalaryEmploy extends Employ {

    public FixedSalaryEmploy(String name, String sex, String salary, int id) {
        super(name, sex, salary, id);
    }

    void calculateSalary() {

        int salary = 10000;
        System.out.println("Employ salary amount: " + salary);
    }
}
