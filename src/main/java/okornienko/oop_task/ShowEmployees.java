package okornienko.oop_task;

/**
 * Created by Aleksandr on 25-08-16.
 */
public class ShowEmployees {
    public static void main (String args[]){
        Employees okorn = new  FixedSalaryEmployee(1,"Oleksandr Kornienko","male");
        Employees rkliuha = new HourRateEmployee(2, "Roman Kliuha", "male", 80);
        Employees kmarko = new  FixedSalaryEmployee(3,"Kvitoslava Marko","female");
        Employees dshkliar = new HourRateEmployee(4, "Dmytro Shkliar", "male", 100);
        Employees ksichenko = new  FixedSalaryEmployee(5,"Kostyantin Sichenko","male");
        Employees dpapshev = new HourRateEmployee(6, "Dima Papshev", "male", 120);
        Employees[] all = {okorn, rkliuha, kmarko, dshkliar, ksichenko, dpapshev};
        for (int i=0;i<all.length;i++){
            all[i].calculateSalary();
            all[i].printSalary();
        }
    }
}
