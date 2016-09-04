package dpapshev.oop_task;

import dpapshev.oop_task.Employee;
import dpapshev.oop_task.FixedSalaryEmployees;
import dpapshev.oop_task.HourRateEmployees;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        final List<FixedSalaryEmployees> FixedSalaryEmployeess = new LinkedList<FixedSalaryEmployees>();
        final List<HourRateEmployees> HourRateEmployeess = new LinkedList<HourRateEmployees>();
        final Map<Integer, Employee> mapOfEmployees = new HashMap<Integer, Employee>();

        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Dima", "male", 1));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Kola", "male", 2));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Peta", "male", 3));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Leva", "male", 4));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Stas", "male", 5));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Jhon", "male", 6));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Vova", "male", 7));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Sergey", "male", 8));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Anton", "male", 9));
        FixedSalaryEmployeess.add(new FixedSalaryEmployees("Ernest", "male", 10));


        HourRateEmployeess.add(new HourRateEmployees("Lena", "female", 11, 20));
        HourRateEmployeess.add(new HourRateEmployees("Oksana", "female", 12, 20));
        HourRateEmployeess.add(new HourRateEmployees("Marta", "female", 13, 20));
        HourRateEmployeess.add(new HourRateEmployees("Alina", "female", 14, 20));
        HourRateEmployeess.add(new HourRateEmployees("Sveta", "female", 15, 23));
        HourRateEmployeess.add(new HourRateEmployees("Alena", "female", 16, 20));
        HourRateEmployeess.add(new HourRateEmployees("Klava", "female", 17, 20));
        HourRateEmployeess.add(new HourRateEmployees("Yaroslava", "female", 18, 22));
        HourRateEmployeess.add(new HourRateEmployees("Zhanna", "female", 19, 20));
        HourRateEmployeess.add(new HourRateEmployees("Maria", "female", 20, 20));


        mapOfEmployees.put(11, new HourRateEmployees("Masha", "female", 21, 20));
        mapOfEmployees.put(12, new HourRateEmployees("Dasha", "female", 22, 22));
        mapOfEmployees.put(13, new HourRateEmployees("Sasha", "female", 22, 24));
        mapOfEmployees.put(14, new HourRateEmployees("Glasha", "female", 24, 25));
        mapOfEmployees.put(15, new HourRateEmployees("Natasha", "female", 25, 26));
        mapOfEmployees.put(16, new FixedSalaryEmployees("Gena", "male", 26));
        mapOfEmployees.put(17, new FixedSalaryEmployees("Sena", "male", 22));
        mapOfEmployees.put(18, new FixedSalaryEmployees("Gosha", "male", 21));
        mapOfEmployees.put(19, new FixedSalaryEmployees("Grisha", "male", 24));
        mapOfEmployees.put(20, new FixedSalaryEmployees("Pavel", "male", 25));

        Collections.sort(HourRateEmployeess);
        printFewLastEmployeesFromList(HourRateEmployeess, 3);
        printFewFirstEmployeesFromList(HourRateEmployeess, 5);
        printMapOfEmployeesBasedOnGender(mapOfEmployees, "male");
    }

    public void printListOfEmployees(final List<? extends Employee> listOfEmployees) {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            listOfEmployees.get(i).printSalary();
        }
    }

    private static void printFewLastEmployeesFromList(final List<? extends Employee> listOfEmployees, final int quantityOfFewLastEmployees) {
        for (int j = listOfEmployees.size() - 1; j >= listOfEmployees.size() - quantityOfFewLastEmployees; j--) {
            listOfEmployees.get(j).printSalary();
        }
    }

    private static void printFewFirstEmployeesFromList(final List<? extends Employee> listOfEmployees, final int quantityOfFewFirstEmployees) {
        for (int j = 0; j < quantityOfFewFirstEmployees; j++) {
            listOfEmployees.get(j).printSalary();
        }
    }

    private static void printMapOfEmployeesBasedOnGender(final Map<Integer, Employee> employeeMap, final String sex) {
        final Iterator<Map.Entry<Integer, Employee>> entries = employeeMap.entrySet().iterator();
        while (entries.hasNext()) {
            final Map.Entry<Integer, Employee> entry = entries.next();
            if (entry.getValue().sex.equalsIgnoreCase(sex)) {
                entry.getValue().printSalary();
            }
        }
    }
}













