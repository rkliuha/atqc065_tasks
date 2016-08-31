package rkliuha.oop_task;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        final List<FixedSalaryEmployee> fixedSalaryEmployees = new LinkedList<>();
        fixedSalaryEmployees.add(new FixedSalaryEmployee(0, "Roman", "Male", 15000));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(1, "Yuriy", "Male", 2000));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(2, "Dima", "Male"));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(3, "Taras", "Male"));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(4, "Kvita", "Female", 5500));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(5, "Roman", "Male"));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(6, "Iva", "Female", 5000));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(7, "Atma", "Female", 7500));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(8, "Brad", "Male", 6000));
        fixedSalaryEmployees.add(new FixedSalaryEmployee(9, "Ignat", "Male", 6700));

        final List<HourRateSalaryEmployee> hourRateSalaryEmployees = new LinkedList<>();
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(0, "Ignat", "Male", 68));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(1, "Brad", "Male", 64));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(2, "Atma", "Female", 78));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(3, "Iva", "Female", 45));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(4, "Roman", "Male", 45));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(5, "Kvita", "Female", 60));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(6, "Taras", "Male", 86));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(7, "Dima", "Male", 45));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(8, "Yuriy", "Male", 60));
        hourRateSalaryEmployees.add(new HourRateSalaryEmployee(9, "Roman", "Male", 120));

        final Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1, new FixedSalaryEmployee(0, "Roman", "Male", 15000));
        employees.put(2, new FixedSalaryEmployee(1, "Yuriy", "Male", 2000));
        employees.put(3, new FixedSalaryEmployee(2, "Dima", "Male"));
        employees.put(4, new FixedSalaryEmployee(3, "Taras", "Male"));
        employees.put(5, new FixedSalaryEmployee(4, "Kvita", "Female", 5500));
        employees.put(6, new FixedSalaryEmployee(5, "Roman", "Male"));
        employees.put(7, new FixedSalaryEmployee(6, "Iva", "Female", 5000));
        employees.put(8, new FixedSalaryEmployee(7, "Atma", "Female", 7500));
        employees.put(9, new FixedSalaryEmployee(8, "Brad", "Male", 6000));
        employees.put(10, new FixedSalaryEmployee(9, "Ignat", "Male", 6700));

        sortBySalary(fixedSalaryEmployees);
        sortBySalary(hourRateSalaryEmployees);

        fixedSalaryEmployees.forEach(System.out::println);
        System.out.println(); // free space between outputs;
        hourRateSalaryEmployees.forEach(System.out::println);

        printOutNames(5, fixedSalaryEmployees);
        printOutNames(5, hourRateSalaryEmployees);

        printOutIDs(3, hourRateSalaryEmployees);
        printOutIDs(3, fixedSalaryEmployees);

        printOutNamesByGender(employees, "Male");
    }

    public static final void sortBySalary(final List<? extends Employee> employees) {
        employees.sort((o1, o2) -> {
            if (o1.getSalary() == o2.getSalary()) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
    }

    public static final void printOutNames(final int numberOfNames,
                                           final List<? extends Employee> employees) {
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(employees.get(i).getName());
        }
    }

    public static final void printOutIDs(final int numberOfIDs,
                                         final List<? extends Employee> employees) {
        for (int i = employees.size() - 1;
             i >= employees.size() - numberOfIDs; i--) {
            System.out.println(employees.get(i).getId());
        }
    }

    public static final void printOutNamesByGender(final Map<Integer, Employee> employees,
                                               final String gender) {
        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getSex().equals(gender)) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue().getName());
            }
        }
    }

}
