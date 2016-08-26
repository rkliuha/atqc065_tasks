package ksichenko.oop_task;

public class FixedSalaryEmploy extends Employ {

    public FixedSalaryEmploy(String name, String sex, String salary, int id) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.id = id;
    }

    public void calculateSalary() {
        int fixedSalary = 10000;
        System.out.println("Employ salary amount: " + fixedSalary);
    }
}
