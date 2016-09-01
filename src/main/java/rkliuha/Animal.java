package rkliuha;

import java.util.HashSet;
import java.util.Set;

public class Animal {

    private final String name;
    private final int age;
    private final double weight;

    public Animal(final String name, final int age, final double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public final String toString() {
        return "\nAnimal: "
                + "name=" + name
                + " age=" + age
                + " weight=" + weight;
    }

    public static void main(final String[] args) {

        final Set<Animal> animalSet = new HashSet<>();
        animalSet.add(new Animal("Cat", 10, 7.5));
        animalSet.add(new Animal("Duckbill", 5, 20.5));
        animalSet.add(new Animal("Rat", 2, 1.5));
        animalSet.forEach(System.out::println);

    }

}
