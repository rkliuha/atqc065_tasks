package ksichenko.oop_task;

abstract class Employ implements CalculateSalary {

    protected String name;
    protected String sex;
    protected String salary;
    protected int id;

    public final void printSalary() {
        System.out.println("Employ name: " + id);
        System.out.println("Employ salary: " + name);
        System.out.println("Employ id: " + salary);
    }

}
