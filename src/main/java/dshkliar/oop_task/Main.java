package dshkliar.oop_task;

public class Main {
    public static void main(final String[] args) {

        Employee vasia = new EmployeeWithFixedSalary(01, "Vasia", 'M', 10000.0);
        Employee ira = new EmployeeWithHourRate(02, "Ira", 'F', 4, 20.8, 8);
        Employee kolia = new EmployeeWithHourRate(03, "Kolia", 'M', 6, 20.8, 8);
        Employee masha = new EmployeeWithFixedSalary(04, "Masha", 'F', 10000.0);

        vasia.printSalary();
        ira.printSalary();
        kolia.printSalary();
        masha.printSalary();
    }
}
