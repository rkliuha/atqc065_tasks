package okornienko;

import java.util.HashSet;
import java.util.Set;

class Animal {
    private Animal(final String nameAnimal, final int ageAnimal, final double weightAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.weightAnimal = weightAnimal;
    }

    private String nameAnimal;
    private int ageAnimal;
    private double weightAnimal;

    public String toString() {
        return "\n" + "Animal name is " + nameAnimal +
                ", " + "animal age is " + ageAnimal +
                ", " + "animal weight is " + weightAnimal + "\n";
    }

    public static void main(String[] args) {
        final Set<Animal> animalsSet = new HashSet<>();
        animalsSet.add(new Animal("Cat", 5, 4));
        animalsSet.add(new Animal("Dog", 3, 5.5));
        animalsSet.add(new Animal("Lion", 14, 10));
        System.out.println(animalsSet);
    }
}
