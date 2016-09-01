package dpapshev.oop_task;

import dpapshev.oop_task.Employee;
import dpapshev.oop_task.FixedSalaryEmployee;
import dpapshev.oop_task.HourRateEmployee;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        final List<FixedSalaryEmployee> fixedSalaryEmployees = new LinkedList<FixedSalaryEmployee>();
        final List<HourRateEmployee> hourRateEmployees = new LinkedList<HourRateEmployee>();
        final Map<Integer, Employee> mapOfEmployees = new HashMap<Integer, Employee>();

        fixedSalaryEmployees.add(new FixedSalaryEmployee("Dima", "male", 1));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Kola", "male", 2));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Peta", "male", 3));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Leva", "male", 4));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Stas", "male", 5));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Jhon", "male", 6));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Vova", "male", 7));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Sergey", "male", 8));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Anton", "male", 9));
        fixedSalaryEmployees.add(new FixedSalaryEmployee("Ernest", "male", 10));


        hourRateEmployees.add(new HourRateEmployee("Lena", "female", 11, 20));
        hourRateEmployees.add(new HourRateEmployee("Oksana", "female", 12, 20));
        hourRateEmployees.add(new HourRateEmployee("Marta", "female", 13, 20));
        hourRateEmployees.add(new HourRateEmployee("Alina", "female", 14, 20));
        hourRateEmployees.add(new HourRateEmployee("Sveta", "female", 15, 23));
        hourRateEmployees.add(new HourRateEmployee("Alena", "female", 16, 20));
        hourRateEmployees.add(new HourRateEmployee("Klava", "female", 17, 20));
        hourRateEmployees.add(new HourRateEmployee("Yaroslava", "female", 18, 22));
        hourRateEmployees.add(new HourRateEmployee("Zhanna", "female", 19, 20));
        hourRateEmployees.add(new HourRateEmployee("Maria", "female", 20, 20));


        mapOfEmployees.put(11, new HourRateEmployee("Masha", "female", 21, 20));
        mapOfEmployees.put(12, new HourRateEmployee("Dasha", "female", 22, 22));
        mapOfEmployees.put(13, new HourRateEmployee("Sasha", "female", 22, 24));
        mapOfEmployees.put(14, new HourRateEmployee("Glasha", "female", 24, 25));
        mapOfEmployees.put(15, new HourRateEmployee("Natasha", "female", 25, 26));
        mapOfEmployees.put(16, new FixedSalaryEmployee("Gena", "male", 26));
        mapOfEmployees.put(17, new FixedSalaryEmployee("Sena", "male", 22));
        mapOfEmployees.put(18, new FixedSalaryEmployee("Gosha", "male", 21));
        mapOfEmployees.put(19, new FixedSalaryEmployee("Grisha", "male", 24));
        mapOfEmployees.put(20, new FixedSalaryEmployee("Pavel", "male", 25));

        Collections.sort(hourRateEmployees);
        printFewLastEmployeesFromList(hourRateEmployees, 3);
        printFewFirstEmployeesFromList(hourRateEmployees, 5);
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













