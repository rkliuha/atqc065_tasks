package okornienko;

import java.util.*;

public class Java8Practice {
    private final static int someNumber = 15;

    public static void main(String[] args) {
        final List<Integer> myIntegerList = Arrays.asList(48, 92, 246, 188);
        System.out.println("Printing numbers:");
        printArray(myIntegerList);

        System.out.println("Min value = " + myIntegerList
                .stream()
                .min(Integer::compareTo).get());

        System.out.println("Max value = " + myIntegerList
                .stream()
                .max(Integer::compareTo).get());

        System.out.println("Average value = " + myIntegerList
                .stream()
                .mapToDouble(average -> Double.parseDouble(String.valueOf(average))).average());

        final List<String> myStringList = Arrays.asList("Roman", "Taras", "Dima", "Inna");
        System.out.println("Printing strings:");

        printArray(myStringList);

        System.out.println("Added some number: ");

        myStringList
                .stream().map((s) -> s + someNumber)
                .forEach(System.out::println);
    }

    private static void printArray(final List array) {
        array.forEach(System.out::println);
    }
}

