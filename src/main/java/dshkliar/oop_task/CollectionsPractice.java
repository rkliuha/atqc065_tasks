package dshkliar.oop_task;

import java.util.*;

public class CollectionsPractice {

    final private List<Employee> listFixedSalary = new LinkedList<Employee>();

    private void addInToListFixedSalary() {
        listFixedSalary.add(new EmployeeWithFixedSalary(1, "Vasia", 'M', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(2, "Olia", 'F', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(3, "Ira", 'F', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(4, "Tolik", 'M', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(5, "Dasha", 'F', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(6, "Kolia", 'M', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(7, "Yura", 'M', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(8, "Andrii", 'M', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(9, "Masha", 'F', 10000.0));
        listFixedSalary.add(new EmployeeWithFixedSalary(10, "Vania", 'M', 10000.0));
        for (Employee employee : listFixedSalary) {
            System.out.println("List Fixed Salary: " + employee);
        }
    }

    private void sortListFixedSalary() {
        Collections.sort(listFixedSalary);
        System.out.println("Sorted List Fixed Salary:");
        for (Employee employee : listFixedSalary) {
            System.out.println(employee);
        }
    }

    private void printFirstFromListFixedSalary(final int limit) {
        int count = 0;
        System.out.println("First " + limit + " From List Fixed Salary: ");
        for (Employee employee : listFixedSalary) {
            if (count < limit) {
                System.out.println(employee.name);
                count++;
            }
        }
    }

    private void printLastFromListFixedSalary(final int limit) {
        System.out.println("Last " + limit + " From List Fixed Salary: ");
        for (Employee employee : listFixedSalary) {
            if ((listFixedSalary.size() - listFixedSalary.indexOf(employee)) <= limit) {
                System.out.println(employee.identifier);
            }
        }
    }

    final private List<Employee> listHourRate = new LinkedList<Employee>();

    private void addInToListHourRate() {
        listHourRate.add(new EmployeeWithHourRate(1, "John", 'M', 4, 20.8, 8));
        listHourRate.add(new EmployeeWithHourRate(2, "Monica", 'F', 5, 18.6, 10));
        listHourRate.add(new EmployeeWithHourRate(3, "Tyler", 'F', 4, 19.4, 6));
        listHourRate.add(new EmployeeWithHourRate(4, "Andy", 'M', 4, 20.1, 8));
        listHourRate.add(new EmployeeWithHourRate(5, "Elvis", 'M', 3, 20.0, 7));
        listHourRate.add(new EmployeeWithHourRate(6, "Ben", 'M', 2, 15.3, 9));
        listHourRate.add(new EmployeeWithHourRate(7, "Lucy", 'F', 5, 19.1, 7));
        listHourRate.add(new EmployeeWithHourRate(8, "Kyle", 'M', 4, 20.7, 8));
        listHourRate.add(new EmployeeWithHourRate(9, "Lora", 'F', 5, 20.8, 5));
        listHourRate.add(new EmployeeWithHourRate(10, "Jimmy", 'M', 3, 19.9, 6));
        for (Employee employee : listHourRate) {
            System.out.println("List Hour Rate: " + employee);
        }
    }

    private void sortListHourRate() {
        Collections.sort(listHourRate);
        System.out.println("Sorted List Hour Rate:");
        for (Employee employee : listHourRate) {
            System.out.println(employee);
        }
    }

    private void printFirstFromListHourRate(final int limit) {
        int count = 0;
        System.out.println("First " + limit + " From List Hour Rate: ");
        for (Employee employee : listHourRate) {
            if (count < limit) {
                System.out.println(employee.name);
                count++;
            }
        }
    }

    private void printLastFromListHourRate(final int limit) {
        System.out.println("Last " + limit + " From List Hour Rate: ");
        for (int i = 0; i < listHourRate.size(); i++) {
            if ((listHourRate.size() - listHourRate.indexOf(listHourRate.get(i))) <= limit) {
                System.out.println(listHourRate.get(i).identifier);
            }
        }
    }

    final private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    private void putMapFixed() {
        employeeMap.put(1, new EmployeeWithFixedSalary(1, "Vasia", 'M', 10000.0));
        employeeMap.put(2, new EmployeeWithFixedSalary(2, "Olia", 'F', 10000.0));
        employeeMap.put(3, new EmployeeWithFixedSalary(3, "Ira", 'F', 10000.0));
        employeeMap.put(4, new EmployeeWithFixedSalary(4, "Tolik", 'M', 10000.0));
        employeeMap.put(5, new EmployeeWithFixedSalary(5, "Dasha", 'F', 10000.0));
        employeeMap.put(6, new EmployeeWithFixedSalary(6, "Kolia", 'M', 10000.0));
        employeeMap.put(7, new EmployeeWithFixedSalary(7, "Yura", 'M', 10000.0));
        employeeMap.put(8, new EmployeeWithFixedSalary(8, "Andrii", 'M', 10000.0));
        employeeMap.put(9, new EmployeeWithFixedSalary(9, "Masha", 'F', 10000.0));
        employeeMap.put(10, new EmployeeWithFixedSalary(10, "Vania", 'M', 10000.0));

        System.out.println("Key-Value collection:");

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().sex == 'M') {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        final CollectionsPractice collectionPracticeObject = new CollectionsPractice();
        collectionPracticeObject.addInToListFixedSalary();
        collectionPracticeObject.addInToListHourRate();
        collectionPracticeObject.sortListFixedSalary();
        collectionPracticeObject.sortListHourRate();
        collectionPracticeObject.printFirstFromListFixedSalary(5);
        collectionPracticeObject.printFirstFromListHourRate(5);
        collectionPracticeObject.printLastFromListFixedSalary(3);
        collectionPracticeObject.printLastFromListHourRate(3);
        collectionPracticeObject.putMapFixed();
    }
}
