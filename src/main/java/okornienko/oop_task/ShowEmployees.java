package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public final class ShowEmployees {
    private ShowEmployees() {
    }

    public static void main(String args[]) {
        double fixedSalary = 10000;
        double hours = 8;
        double days = 20.8;
        double rkliuhaHourRate = 80;
        double dshkliarHourRate = 100;
        double dpapshevHourRate = 120;
        String[] names = {null, "Oleksandr Kornienko", "Roman Kliuha", "Kvitoslava Marko",
                "Dmytro Shkliar", "Kostyantin Sichenko", "Dima Papshev"};
        String[] sex = {null, "male", "male", "female", "male", "male", "male"};
        Employees okorn = new FixedSalaryEmployee(1, names[1], sex[1], fixedSalary);
        Employees rkliuha = new HourRateEmployee(2, names[2], sex[2], rkliuhaHourRate, hours, days);
        Employees kmarko = new FixedSalaryEmployee(3, names[3], sex[3], fixedSalary);
        Employees dshkliar = new HourRateEmployee(4, names[4], sex[4], dshkliarHourRate, hours, days);
        Employees ksichenko = new FixedSalaryEmployee(5, names[5], sex[5], fixedSalary);
        Employees dpapshev = new HourRateEmployee(6, names[6], sex[6], dpapshevHourRate, hours, days);
        Employees[] all = {okorn, rkliuha, kmarko, dshkliar, ksichenko, dpapshev};
        for (int i = 0; i < all.length; i++) {
            all[i].calculateSalary();
            all[i].printSalary();
        }
    }
}
