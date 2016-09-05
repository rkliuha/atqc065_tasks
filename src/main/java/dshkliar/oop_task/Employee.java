package dshkliar.oop_task;

public abstract class Employee implements Salary, Comparable<Employee> {

    protected String name;
    protected char sex;
    protected int identifier;
    protected double salary;
    protected int hourRate;
    protected double rate;
    protected int hours;

    Employee(final int identifier, final String name, final char sex) {
        this.identifier = identifier;
        this.name = name;
        this.sex = sex;
    }

    abstract void printSalary();

    @Override
    public String toString() {
        return "Employee " + "№" + identifier +
                ", Name: '" + name +
                "', Sex: '" + sex +
                "', hours: " + hours +
                ", Hour Rate: " + hourRate +
                ", Rate: " + rate +
                ", Salary: " + salary;
    }

/*    public int compareTo(Employee e1) {
        double compSal = e1.salary;
        if(this.salary > compSal){
            return 1;
        } else if(this.salary == compSal){
            return 0;
        } else {
            return -1;
        }
    }*/

    public int compareTo(final Employee employee) {
        double compareSalary = employee.salary - salary;
        if (compareSalary != 0) {
            return (int) compareSalary;
        } else {
            compareSalary = name.compareTo(employee.name);
        }
        if (compareSalary != 0) {
            return (int) compareSalary;
        } else {
            return 0;
        }
    }

//    static Comparator<Employee> compEmp = new Comparator<Employee>() {
//        public int compare(Employee o1, Employee o2) {
//            return o1.name.compareTo(o2.name);
//        }
//    };
}
