package dshkliar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Practice {

    final private List<Integer> numbers = new ArrayList<Integer>();
    final private Random random = new Random();

    private void randomNumbersList() {
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
            System.out.print(numbers.get(i) + " ");
        }
    }

    private void getMax() {
        System.out.println("\nHighest number in List: " +
                numbers.stream().max(Integer::compareTo).get());
    }

    private void getMin() {
        System.out.println("Lowest number in List: " +
                numbers.stream().min(Integer::compareTo).get());
    }

    private void getAvg() {
        System.out.println("Average number in List: " +
                (int) numbers.stream().mapToInt((x) -> x).average().getAsDouble());
    }

    final private List<String> stringList = new LinkedList<>();

    private void setStringList() {
        stringList.add("\nThis is ");
        stringList.add("a string ");
        stringList.add("list ");
        stringList.add("collection.");

        for (String str : stringList) {
            System.out.print(str);
        }

        stringList.stream()
                .map((s) -> s + "_1_")
                .collect(Collectors.toList())
                .forEach(System.out::print);

/*        System.out.print("\n" + stringList.stream()
                .map((s) -> s + "_1")
                .collect(Collectors.toList())
                .forEach(System.out::println));*/
    }


    public static void main(String[] args) {
        Java8Practice javaPractice = new Java8Practice();
        javaPractice.randomNumbersList();
        javaPractice.getMax();
        javaPractice.getMin();
        javaPractice.getAvg();
        javaPractice.setStringList();
    }
}
