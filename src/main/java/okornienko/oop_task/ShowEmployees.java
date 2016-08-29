package okornienko.oop_task;

public final class ShowEmployees {
    private ShowEmployees() {
    }
    public static void main(String args[]) {
        final double fixedSalary = 10000;
        final double hours = 8;
        final double days = 20.8;

        final Employees okorn = new FixedSalaryEmployee(1, "Oleksandr Kornienko", "male", fixedSalary);
        final Employees rkliuha = new HourRateEmployee(2, "Kvita Marko", "female", 80, hours, days);
        final Employees kmarko = new FixedSalaryEmployee(3, "Dima Papshev", "male", fixedSalary);
        final Employees[] allEmployees = {okorn, rkliuha, kmarko};

        for (int i = 0; i < allEmployees.length; i++) {
            allEmployees[i].calculateSalary();
            allEmployees[i].printSalary();
        }
    }
}
