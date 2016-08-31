package okornienko.oop_task;

import java.util.ArrayList;
import java.util.List;

public final class ShowEmployees {
    private ShowEmployees() {
    }

    public static void main(String args[]) {
        final double fixedSalary = 10000;
        final double hours = 8;
        final double days = 20.8;

        final Employee okorn = new FixedSalaryEmployee(1, "Oleksandr", "male", fixedSalary, 0);
        final Employee kmarko = new FixedSalaryEmployee(3, "Dima", "male", fixedSalary, 0);
        final Employee rkliuha = new HourRateEmployee(2, "Kvita", "female", 80, hours, days);
        final Employee aladin = new HourRateEmployee(4, "Aladin", "male", 90, hours, days);

        final Employee[] allEmployees = {okorn, rkliuha, kmarko, aladin};

        for (Employee allEmployee : allEmployees) {
            allEmployee.calculateSalary();
            allEmployee.printSalary();
        }

    }
}
