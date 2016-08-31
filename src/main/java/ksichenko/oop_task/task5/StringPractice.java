package ksichenko.oop_task.task5;

import java.util.Random;

public class StringPractice {

    public static void main(String[] args) {

        final String[] stringsArray = {"fhfggfaflagf", "klflflfg", "keflF", "EFLf", "kjfhgluhg", "lrg", "kuhghwuHFa", "ajhgfsgd"};
        final String[] newStringArray = new String[50];
        final String[] arrayWithA = new String[50];
        final String[] arrayWithoutVowels = new String[50];

        int randomIndex;
        int stringCounterA = 0;

        for (int i = 0; i < 50; i++) {
            randomIndex = new Random().nextInt(stringsArray.length);
            newStringArray[randomIndex] = (stringsArray[randomIndex]);
            System.out.println("Array strings: " + newStringArray[randomIndex]);
        }

        for (int i = 0; i < newStringArray.length; i++) {
            if (newStringArray[i].contains("a")) {
                arrayWithA[i] = newStringArray[i];
                stringCounterA++;
            }

            System.out.println("Array with 'A': " + arrayWithA[i]);
        }

        System.out.println("Amount 'A': " + stringCounterA);

        for (int i = 0; i < newStringArray.length; i++) {
            if (newStringArray[i].contains("[aeiouy]")) {
                arrayWithoutVowels[i] = newStringArray[i].replaceAll("[aeiouy]", "?");
            }
            System.out.println("Array Without Vowels: " + arrayWithoutVowels[i]);
        }
    }
}










