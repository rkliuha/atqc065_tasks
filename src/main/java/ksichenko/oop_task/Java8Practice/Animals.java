package ksichenko.oop_task.Java8Practice;

import java.util.HashSet;
import java.util.Set;

public class Animals {

    protected String animal;
    protected String name;
    protected int age;
    protected double weight;

    public void printAnimalsInformation() {
        System.out.println("Animal: " + animal);
        System.out.println("Animal name : " + name);
        System.out.println("Animal age : " + age);
        System.out.println("Animal weight : " + weight);
    }

    public Animals(final String animal, final String name, final int age, final double weight) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {

        final Set<Animals> animalsSet = new HashSet<>();

        animalsSet.add(new Animals("cat", "dora", 10, 5.5));
        animalsSet.add(new Animals("dog", "zeus", 15, 10));
        animalsSet.add(new Animals("mouse", "ratatuj", 15, 10));

        animalsSet
                .stream()
                .forEachOrdered(Animals::printAnimalsInformation);
    }
}
