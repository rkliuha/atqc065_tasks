package ksichenko.oop_task;

abstract class Employee implements CalculateSalary {

    protected String name;
    protected String sex;
    protected String salary;
    protected int id;

    public final void printSalary() {
        System.out.println("Employ id: " + id);
        System.out.println("Employ name: " + name);
        System.out.println("Employ salary: " + salary);
    }

}