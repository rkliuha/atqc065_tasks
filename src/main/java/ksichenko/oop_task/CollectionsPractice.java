package ksichenko.oop_task;

import dshkliar.oop_task.Employee;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        final List<Employees> hourEmployeesList = new LinkedList<Employees>();
        final List<Employees> fixedEmployeesList = new LinkedList<Employees>();

        hourEmployeesList.add(new HourRateSalary("Marko", "female", 1, 30));
        hourEmployeesList.add(new HourRateSalary("Kuncjak", "female", 2, 50));
        hourEmployeesList.add(new HourRateSalary("Sheshorak", "male", 3, 53));
        hourEmployeesList.add(new HourRateSalary("Papshev", "male", 4, 80));
        hourEmployeesList.add(new HourRateSalary("Kaban", "male", 5, 10));
        hourEmployeesList.add(new HourRateSalary("Shiblenuj", "male", 6, 20));
        hourEmployeesList.add(new HourRateSalary("Mazneva", "female", 7, 85));
        hourEmployeesList.add(new HourRateSalary("Sichenko", "male", 8, 80));
        hourEmployeesList.add(new HourRateSalary("Pyatkevich", "female", 9, 64));
        hourEmployeesList.add(new HourRateSalary("Veretko", "male", 10, 18));

        fixedEmployeesList.add(new FixedSalaryEmploy("Giga", "male", 1));
        fixedEmployeesList.add(new FixedSalaryEmploy("Pupkin", "male", 2));
        fixedEmployeesList.add(new FixedSalaryEmploy("Gopkin", "male", 3));
        fixedEmployeesList.add(new FixedSalaryEmploy("Ignacik", "male", 4));
        fixedEmployeesList.add(new FixedSalaryEmploy("Korolova", "female", 5));
        fixedEmployeesList.add(new FixedSalaryEmploy("Meniv", "male", 6));
        fixedEmployeesList.add(new FixedSalaryEmploy("Jaga", "male", 7));
        fixedEmployeesList.add(new FixedSalaryEmploy("Gnu", "male", 8));
        fixedEmployeesList.add(new FixedSalaryEmploy("Tarasenko", "male", 9));
        fixedEmployeesList.add(new FixedSalaryEmploy("Filin", "male", 10));

        for (Employees fixedEmployees : fixedEmployeesList) {
            System.out.println(fixedEmployees.id + fixedEmployees.name + fixedEmployees.sex);
        }

        Collections.sort(fixedEmployeesList);

        for (Employees fixedEmployees : fixedEmployeesList) {
            fixedEmployees.printSalary();
        }

        System.out.println(fixedEmployeesList.get(0).name);
        System.out.println(fixedEmployeesList.get(1).name);
        System.out.println(fixedEmployeesList.get(2).name);
        System.out.println(fixedEmployeesList.get(3).name);
        System.out.println(fixedEmployeesList.get(4).name);

        System.out.println(fixedEmployeesList.get(7).id);
        System.out.println(fixedEmployeesList.get(8).id);
        System.out.println(fixedEmployeesList.get(9).id);

        final Map<Integer, Employees> employeesMap = new HashMap<Integer, Employees>();

        employeesMap.put(1, new FixedSalaryEmploy("Giga", "male", 11));
        employeesMap.put(2, new FixedSalaryEmploy("Pupkin", "male", 12));
        employeesMap.put(3, new FixedSalaryEmploy("Gopkin", "male", 13));
        employeesMap.put(4, new FixedSalaryEmploy("Ignacik", "male", 14));
        employeesMap.put(5, new FixedSalaryEmploy("Korolova", "female", 15));
        employeesMap.put(6, new FixedSalaryEmploy("Meniv", "male", 16));
        employeesMap.put(7, new FixedSalaryEmploy("Jaga", "male", 17));
        employeesMap.put(8, new FixedSalaryEmploy("Gnu", "male", 18));
        employeesMap.put(9, new FixedSalaryEmploy("Tarasenko", "male", 19));
        employeesMap.put(10, new FixedSalaryEmploy("Filin", "male", 20));

        for (Map.Entry<Integer, Employees> entry : employeesMap.entrySet()) {
            if (entry.getValue().sex.equals("female")) {
                System.out.println(entry.getValue().id);
                System.out.println(entry.getValue().name);
            }
        }

    }
}
