package kmarko;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Practice {

    public static void main(String args[]) {

        /*Tas_7_2*/
        final List<Integer> randomNumbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbersList.add(i);
        }

        Collections.shuffle(randomNumbersList);

        System.out.println("Min number: " + randomNumbersList
                .stream()
                .min(Integer::compareTo)
                .get());

        System.out.println("Max number: " + randomNumbersList
                .stream()
                .max(Integer::compareTo)
                .get());

        System.out.println("Average number: " + randomNumbersList
                .stream()
                .mapToDouble(Integer::intValue)
                .average());

        /*Task_7_3*/
        final String forStringCollectionCreation = "grtfh, jfkdf, jeooejf, opoe, khjhf";
        final List<String> stringCollection = new ArrayList<>(Arrays
                .asList(StringUtils.splitString(forStringCollectionCreation, ",")));

        stringCollection
                .stream()
                .map((everyElement) -> everyElement + "10")
                .collect(Collectors.toList()).forEach(System.out::print);
    }
}
