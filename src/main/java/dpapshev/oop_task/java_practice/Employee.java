package dpapshev.oop_task.java_practice;


abstract class Employee implements SalaryCalculator, Comparable<Employee> {
    protected String name;
    protected String sex;
    protected int id;
    protected double salary;


    public int compareTo(final Employee employee) {
        if (this.salary - employee.salary == 0) {
            return this.name.compareTo(employee.name);
        } else {
            return Double.compare(employee.salary, this.salary);
        }
    }

    public void printSalary() {
        System.out.println("Employee: " + name + " Id# " + id + " Salary: " + salary);
    }
}
