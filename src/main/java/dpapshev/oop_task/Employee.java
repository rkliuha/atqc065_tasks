package dpapshev.oop_task;


abstract class Employee implements SalaryCalculator, Comparable<Employee> {
    protected String name;
    protected String sex;
    protected int id;
    protected double salary;


    public int compareTo(Employee o) {
        if (this.salary - o.salary == 0) {
            return this.name.compareTo(o.name);
        } else {
            return Double.compare(o.salary, this.salary);
        }
    }

    public void printSalary() {
        System.out.println("Employee: " + name + " Id# " + id + " Salary: " + salary);
    }
}
