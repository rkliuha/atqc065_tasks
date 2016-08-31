package ksichenko.oop_task.Java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Java8Practice {

    public static void main(String[] args) {

        final Random random = new Random();

        final List<Integer> randomNumbersList = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            randomNumbersList.add(random.nextInt(100));
        }

//        randomNumbersList
//                .stream()
//                .map(integer -> randomNumbersList.add(random.nextInt(100)));

        System.out.println(randomNumbersList
                .stream()
                .min(Integer::compareTo).get());

        System.out.println(randomNumbersList
                .stream()
                .max(Integer::compareTo).get());

        System.out.println(randomNumbersList
                .stream()
                .mapToInt((average) -> Integer.parseInt(String.valueOf(average))).average());

        final List<String> stringsList = new ArrayList<>();

        stringsList.add("absd");
        stringsList.add("fgkl");
        stringsList.add("mprs");

        stringsList
                .stream()
                .forEach(System.out::println);


    }
}

