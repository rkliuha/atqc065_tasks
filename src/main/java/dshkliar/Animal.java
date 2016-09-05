package dshkliar;

import java.util.HashSet;
import java.util.Set;

public class Animal {
    private String name;
    private int age;
    private double weight;

    private Animal(final String name, final int age, final double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nAnimal: " +
                "name='" + name +
                "', age=" + age +
                ", weight=" + weight;
    }

    public static void main(String[] args) {
        final Set<Animal> animalSet = new HashSet<>();
        animalSet.add(new Animal("Panda", 10, 65.3));
        animalSet.add(new Animal("Wolf", 5, 15.3));

        animalSet.forEach(System.out::print);
    }
}
