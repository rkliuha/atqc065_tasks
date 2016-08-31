package okornienko.oop_task;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        final double fixedSalary = 10000;
        final double hours = 8;
        final double days = 20.8;
        final Employee oleksandr = new FixedSalaryEmployee(1, "Oleksandr", "male", fixedSalary, 0);
        final Employee dima = new FixedSalaryEmployee(2, "Dima", "male", fixedSalary, 0);
        final Employee calvin = new FixedSalaryEmployee(3, "Calvin", "male", fixedSalary, 0);
        final Employee curt = new FixedSalaryEmployee(4, "Curt", "male", fixedSalary, 0);
        final Employee cedric = new FixedSalaryEmployee(5, "Cedric", "male", fixedSalary, 0);

        final Employee kvita = new HourRateEmployee(6, "Kvita", "female", 80, hours, days);
        final Employee aladin = new HourRateEmployee(7, "Aladin", "male", 90, hours, days);
        final Employee angela = new HourRateEmployee(8, "Angela", "female", 100, hours, days);
        final Employee anna = new HourRateEmployee(9, "Anna", "female", 120, hours, days);
        final Employee beatrice = new HourRateEmployee(10, "Beatrice", "female", 75, hours, days);

        final List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(oleksandr, dima, calvin, curt, cedric, kvita, aladin, angela, anna, beatrice));

        showAllEmployers(employees);
        employees.sort((employee1, employee2) -> {
            if (employee1.getemployeeSalary() == employee2.getemployeeSalary()) {
                return employee1.getemployeeName().compareTo(employee2.getemployeeName());
            } else {
                return Double.compare(employee1.getemployeeSalary(), employee2.getemployeeSalary());
            }
        });
        System.out.println("Sorting by salary, if salaries are equal, sorting by the name:");
        showAllEmployers(employees);
        System.out.println("Printing out only 5 first employee names from list:");
        showFirstEmployers(employees, 5);
        System.out.println("Printing out only 3 last employee names from list:");
        showLastEmployers(employees, 3);

        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(0, new FixedSalaryEmployee(1, "Roman", "Male", 15000, 0));
        employeesMap.put(1, new FixedSalaryEmployee(2, "Taras", "Male", 2000, 1000));
        employeesMap.put(2, new FixedSalaryEmployee(3, "Dima", "Male", 2000, 500));
        employeesMap.put(3, new FixedSalaryEmployee(4, "Illya", "Male", 200, 1000));
        employeesMap.put(4, new FixedSalaryEmployee(5, "Inna", "Female", 1000, 1000));
        employeesMap.put(5, new HourRateEmployee(6, "Roman", "Male", 80, hours, days));
        employeesMap.put(6, new HourRateEmployee(7, "Inna", "Female", 100, hours, days));
        employeesMap.put(7, new HourRateEmployee(8, "Anna", "Female", 20, hours, days));
        employeesMap.put(8, new HourRateEmployee(9, "Igor", "Male", 50, hours, days));
        employeesMap.put(9, new HourRateEmployee(10, "Calvin", "Male", 200, hours, days));
        System.out.println("Printing keys and values only for male Employees:");
        showMapedEmployers(employeesMap, "Male");
    }

    private static void showAllEmployers(final List<Employee> listEmployee) {
        for (Employee iterator : listEmployee) {
            iterator.calculateSalary();
            System.out.println(iterator.getemployeeId() + ". " + iterator.getemployeeName() + " " +
                    iterator.getemployeeSex() + " " + iterator.getemployeeSalary());

        }
        System.out.println();
    }

    private static void showFirstEmployers(final List<Employee> listEmployee, final int firstNumbers) {
        for (int i = 0; i < firstNumbers; i++) {
            listEmployee.get(i).calculateSalary();
            System.out.println(listEmployee.get(i).getemployeeId() + ". " + listEmployee.get(i).getemployeeName() + " " +
                    listEmployee.get(i).getemployeeSex() + " " + listEmployee.get(i).getemployeeSalary());

        }
        System.out.println();
    }

    private static void showLastEmployers(final List<Employee> listEmployee, final int lastNumbers) {
        //listEmployee.size() - 1 because the last element will be size(10)-1=9
        int firstNumbers = listEmployee.size() - 1 - lastNumbers;
        for (int i = listEmployee.size() - 1; i > firstNumbers; i--) {
            listEmployee.get(i).calculateSalary();
            System.out.println(listEmployee.get(i).getemployeeId() + ". " + listEmployee.get(i).getemployeeName() + " " +
                    listEmployee.get(i).getemployeeSex() + " " + listEmployee.get(i).getemployeeSalary());

        }
        System.out.println();
    }

    private static void showMapedEmployers(final Map<Integer, Employee> employeesMap, final String male) {

        for (int i = 0; i < employeesMap.size(); i++) {
            if (employeesMap.get(i).getemployeeSex().equals(male)) {
                employeesMap.get(i).calculateSalary();
                System.out.println(employeesMap.get(i).getemployeeId() + ". " + employeesMap.get(i).getemployeeName() + " " + employeesMap.get(i).getemployeeSex() +
                        " " + employeesMap.get(i).getemployeeSalary());
            }
        }
    }

}


