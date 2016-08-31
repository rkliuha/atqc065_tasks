package ksichenko.oop_task;

abstract class Employees implements CalculateSalary, Comparable<Employees> {

    protected String name;
    protected String sex;
    protected int salary;
    protected int id;

    public final void printSalary() {
        System.out.println("Employ id: " + id);
        System.out.println("Employ name: " + name);
        System.out.println("Employ salary: " + salary);
    }


    public int compareTo(Employees employees) {
        if (salary != employees.salary) {
            return Double.compare(salary, employees.salary);
        } else
            return name.compareTo(employees.name);
    }
}