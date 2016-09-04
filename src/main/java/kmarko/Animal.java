package kmarko;

import java.util.HashSet;
import java.util.Set;

public class Animal {

    private String name;
    private double weight;
    private int age;

    private Animal(final String name, final double weight, final int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age;
    }

    public static void main(String[] args) {

        final Set<Animal> animals = new HashSet<>();

        final Animal dog = new Animal("Charley", 5, 4);
        final Animal cat = new Animal("Gigi", 2, 3);
        final Animal hamster = new Animal("Boris", 0.200, 1);

        animals.add(cat);
        animals.add(dog);
        animals.add(hamster);
    }
}

