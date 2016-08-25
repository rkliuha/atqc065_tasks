package dpapshev.oop_task;


public abstract class Employee {
    protected String name;
    protected String sex;
    protected int id;
    protected double salary;


    public abstract void calculateSalary();
    public void printSalary(){
        System.out.println("Employee: "+name+" Id# "+id+" Salary: "+salary);
    }

}
