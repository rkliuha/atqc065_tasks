package okornienko;

import java.util.*;
import java.util.stream.Collectors;


public class Java8Practice {
    public static void main(String[] args) {
        System.out.println("Printing numbers:");
        List<Integer> myIntegerList = Arrays.asList(48, 92, 246, 188);
        myIntegerList
                .forEach(System.out::println);
        int maxValue = myIntegerList.stream().collect(Collectors.reducing(Integer::max)).get();
        int minValue = myIntegerList.stream().collect(Collectors.reducing(Integer::min)).get();
        System.out.println("max value is - " + maxValue);
        System.out.println("min value is - " + minValue);
        System.out.println("average value is - " + minValue);
        System.out.println();
        System.out.println("Printing strings:");
        List<String> myStringList = Arrays.asList("Roman", "Taras", "Dima", "Inna");

        myStringList
                .forEach(System.out::println);

    }
}

