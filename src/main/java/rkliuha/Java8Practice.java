package rkliuha;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Practice {

    public static void main(final String[] args) {

        final List<Integer> randomNumbers = new LinkedList<>();

        addRandomNumbersTo(randomNumbers, 10);

        randomNumbers.forEach(System.out::println);

        final int maxNumberFromList = getMaxNumberFrom(randomNumbers);
        final int minNumberFromList = getMinNumberFrom(randomNumbers);
        final double averageNumberFromList = getAverageNumberFrom(randomNumbers);

        System.out.println("\nMaximum number from List is: " + maxNumberFromList
                + "\nMinimum number from List is: " + minNumberFromList
                + "\nAverage number from List is: " + averageNumberFromList
                + "\n");

        List<String> justStrings = new LinkedList<>();

        justStrings.add("Too");
        justStrings.add("much");
        justStrings.add("homework");
        justStrings.add("we");
        justStrings.add("have");
        justStrings.add("to");
        justStrings.add("perform");
        justStrings.add("today");

        justStrings = getAddedNumbersToStringList(justStrings, 7);

        justStrings.forEach(System.out::println);

    }

    public static final void addRandomNumbersTo(final List<Integer> randomNumbers,
                                                final int amountOfNumbers) {
        final Random randomGenerator = new Random();
        for (int i = 0; i < amountOfNumbers; i++) {
            randomNumbers.add(randomGenerator.nextInt(100));
        }
    }

    public static final int getMaxNumberFrom(final List<Integer> randomNumbers) {
        return randomNumbers
                .stream()
                .max(Integer::compare)
                .get();
    }

    public static final int getMinNumberFrom(final List<Integer> randomNumbers) {
        return randomNumbers
                .stream()
                .min(Integer::compare)
                .get();
    }

    public static final double getAverageNumberFrom(final List<Integer> randomNumbers) {
        return randomNumbers
                .stream()
                .mapToInt((x) -> x)
                .average()
                .getAsDouble();
    }

    public static final List<String> getAddedNumbersToStringList(final List<String> justStrings,
                                                                 final int numberForAdd) {
        return justStrings
                .stream()
                .map(s -> s + numberForAdd)
                .collect(Collectors.toList());
    }

}
