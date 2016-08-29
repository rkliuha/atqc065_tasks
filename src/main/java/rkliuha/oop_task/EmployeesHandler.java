package rkliuha.oop_task;

public class EmployeesHandler {

    public static void main(final String[] args) {

        final Employee ahmed =
                new HourRateSalaryEmployee(1, "Ahmed", "Male", 20.8, 15, 8);

        final Employee cate =
                new FixedSalaryEmployee(2, "Cate", "Female", 8000);

        final Employee cain =
                new FixedSalaryEmployee(3, "Cain", "Male");

        final Employee miranda =
                new HourRateSalaryEmployee(4, "Miranda", "Female", 10);

        ahmed.printSalary();
        cate.printSalary();
        cain.printSalary();
        miranda.printSalary();
    }

}
