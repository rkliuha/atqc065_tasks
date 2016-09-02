package kmarko.oop_task;

import java.util.*;

public class CollectionsPractice {

    final private List<EmployeeFixedSalary> employeeFixedSalaryList = new ArrayList(10);
    final private List<EmployeeHourlySalary> employeeHourlySalaryList = new ArrayList(10);
    final private Map<Integer, AbstractEmployee> newEmployeeList = new HashMap<>();


    final EmployeeFixedSalary radchenko = new EmployeeFixedSalary("Igor", 1, 'M', 10000);
    final EmployeeFixedSalary boyko = new EmployeeFixedSalary("Elena", 2, 'F', 10000);
    final EmployeeFixedSalary abram = new EmployeeFixedSalary("Katya", 3, 'F', 10000);
    final EmployeeFixedSalary kostuchenko = new EmployeeFixedSalary("Ivan", 4, 'M', 10000);
    final EmployeeFixedSalary kuzmin = new EmployeeFixedSalary("Vlad", 5, 'M', 10000);
    final EmployeeFixedSalary kravec = new EmployeeFixedSalary("Lina", 6, 'F', 10000);
    final EmployeeFixedSalary boichenko = new EmployeeFixedSalary("Ira", 7, 'F', 10000);
    final EmployeeFixedSalary myshuga = new EmployeeFixedSalary("Nikolas", 8, 'M', 10000);
    final EmployeeFixedSalary fet = new EmployeeFixedSalary("Pavel", 9, 'F', 10000);
    final EmployeeFixedSalary gorunov = new EmployeeFixedSalary("Eugen", 10, 'F', 10000);

    final public void fillInEmployeeFixedSalaryList() {
        employeeFixedSalaryList.addAll(Arrays.asList(radchenko, boyko, abram, kostuchenko,
                kuzmin, kravec, boichenko, myshuga, fet, gorunov));
    }

    final public void printEmployeeFixedSalaryList() {
        for (int i = 0; i < employeeFixedSalaryList.size(); i++) {
            System.out.println(employeeFixedSalaryList.get(i));
        }
    }

    final EmployeeHourlySalary kondratuk = new EmployeeHourlySalary("Boris", 11, 'M', 5);
    final EmployeeHourlySalary zenko = new EmployeeHourlySalary("Ross", 12, 'M', 7);
    final EmployeeHourlySalary dzhus = new EmployeeHourlySalary("Vasyl", 13, 'M', 6);
    final EmployeeHourlySalary smith = new EmployeeHourlySalary("Gladis", 14, 'F', 12);
    final EmployeeHourlySalary verba = new EmployeeHourlySalary("Kateryna", 15, 'F', 9);
    final EmployeeHourlySalary valevskiy = new EmployeeHourlySalary("Egor", 16, 'M', 4);
    final EmployeeHourlySalary movchan = new EmployeeHourlySalary("Oles", 17, 'M', 10);
    final EmployeeHourlySalary plisha = new EmployeeHourlySalary("Roman", 18, 'M', 8);
    final EmployeeHourlySalary konyk = new EmployeeHourlySalary("Bohdan", 19, 'M', 14);
    final EmployeeHourlySalary reva = new EmployeeHourlySalary("Mara", 20, 'F', 15);

    final public void fillInEmployeeHourlySalaryList() {

        employeeHourlySalaryList.addAll(Arrays.asList(kondratuk, zenko, dzhus,
                smith, verba, valevskiy, movchan, plisha, konyk, reva));
    }

    final public void printEmployeeHourlySalaryList() {
        for (int i = 0; i < employeeHourlySalaryList.size(); i++) {
            System.out.println(employeeHourlySalaryList.get(i));
        }
    }

    final public void sortEmployeeFixedSalaryList() {
        Collections.sort(employeeFixedSalaryList);
        for (int i = 0; i < employeeFixedSalaryList.size(); i++) {
            System.out.println(employeeFixedSalaryList.get(i));
        }
    }

    final public void sortEmployeeHourlySalaryList() {
        Collections.sort(employeeHourlySalaryList);
        for (int i = 0; i < employeeHourlySalaryList.size(); i++) {
            System.out.println(employeeHourlySalaryList.get(i));
        }
    }

    //This method's parameter passes value which is calculated: firstItemsInList= (- 1) +
    // employeeFixedSalaryList.size - number of items to print;

    final public void printFirstEmployeeFixedSalaryList(final int firstItemsInList) {
        for (int i = 0; i < employeeFixedSalaryList.size(); i++) {
            System.out.println(employeeFixedSalaryList.get(i).name);
            if (i == firstItemsInList) {
                break;
            }
        }
    }

    //This method's parameter passes value which is calculated: firstItemsInList= (- 1) +
    // employeeHourlySalaryList.size - number of items to print;

    final public void printFirstEmployeeHourlySalaryList(final int firstItemsInList) {
        for (int i = 0; i < employeeHourlySalaryList.size(); i++) {
            System.out.println(employeeHourlySalaryList.get(i).name);
            if (i == firstItemsInList) {
                break;
            }
        }
    }

    //This method's parameter passes value which is calculated: lastItemsInList=
    // employeeFixedSalaryList.size - number of of items to print;

    final public void printLastIdEmployeeFixedSalaryList(final int lastItemsInList) {
        for (int i = employeeFixedSalaryList.size() - 1; i >= 0; i--) {
            System.out.println(employeeFixedSalaryList.get(i).identifier);
            if (i == lastItemsInList) {
                break;
            }
        }
    }

    //This method's parameter passes value which is calculated: lastItemsInList=
    // employeeHourlySalaryList.size - number of of items to print;

    final public void printLastIdEmployeeHourlySalaryList(final int lastItemsInList) {
        for (int i = employeeHourlySalaryList.size() - 1; i >= 0; i--) {
            System.out.println(employeeHourlySalaryList.get(i).identifier);
            if (i == lastItemsInList) {
                break;
            }
        }
    }

    final public void task_6_6() {

        newEmployeeList.put(1, dzhus);
        newEmployeeList.put(2, myshuga);
        newEmployeeList.put(3, konyk);
        newEmployeeList.put(4, boichenko);
        newEmployeeList.put(5, smith);
        newEmployeeList.put(6, verba);
        newEmployeeList.put(7, kondratuk);
        newEmployeeList.put(8, radchenko);
        newEmployeeList.put(9, reva);
        newEmployeeList.put(10, kuzmin);

        newEmployeeList.entrySet()
                .stream()
                .filter(entry -> entry.getValue().sex == 'M')
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    public static void main(String[] args) {
        /*Task_6_2*/
        final CollectionsPractice newFixedEmployeeList = new CollectionsPractice();
        newFixedEmployeeList.fillInEmployeeFixedSalaryList();
        newFixedEmployeeList.printEmployeeFixedSalaryList();

        /*Task_6_2*/
        final CollectionsPractice newHourlyEmployeeList = new CollectionsPractice();
        newHourlyEmployeeList.fillInEmployeeHourlySalaryList();
        newHourlyEmployeeList.printEmployeeHourlySalaryList();

        /*Task_6_3*/
        newFixedEmployeeList.sortEmployeeFixedSalaryList();
        newHourlyEmployeeList.sortEmployeeHourlySalaryList();

        /*Task_6_4*/
        newFixedEmployeeList.printFirstEmployeeFixedSalaryList(4);
        newHourlyEmployeeList.printFirstEmployeeHourlySalaryList(4);

        /*Task_6_5*/
        newFixedEmployeeList.printLastIdEmployeeFixedSalaryList(7);
        newHourlyEmployeeList.printLastIdEmployeeHourlySalaryList(7);

        /*task_6_6*/
        newFixedEmployeeList.task_6_6();
    }
}
