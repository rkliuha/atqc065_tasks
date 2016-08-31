package okornienko;

import java.util.Random;

public class StringPractice {
    static String unsortedString;

    private static void createRandomStrings() {
        final String allSymbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final Random random = new Random();
        final StringBuilder stringOfChars = new StringBuilder();
        int select;

        for (int j = 0; j < 50; j++) { // 50 - це число строк, які потрібно створити
            for (int i = 0; i < 10; i++) { // 10 - це кількість символів на одній строці
                select = random.nextInt(allSymbols.length()); // отримуєм випадкове число в межах строки allSymbols
                stringOfChars.append(allSymbols.charAt(select)); // заносим випадковий символ в stringOfChars
            }
            stringOfChars.append("\n");
        }
        unsortedString = stringOfChars.toString();
        System.out.println(unsortedString);
    }

    private static void countChars() {
        int count = 0;
        for (
                int i = 0; i < unsortedString.length(); i++) {
            if (unsortedString.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Total count of a = " + count); //виводим кількість символів "а"
    }

    private static void replaceChars() {
        unsortedString = unsortedString.replaceAll("\n", ""); // обєднюєм в один рядок
        unsortedString = unsortedString.replaceAll("[u,i,o,a,y,e]", "?"); // заміняєм u,i,o,a,y,e на ?
        System.out.println(unsortedString);

        int count = 0;
        for (int i = 0; i < unsortedString.length(); i++) {
            if (unsortedString.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Total count of ? = " + count); //виводим кількість символів "?"
    }

    public static void main(String[] args) {
        createRandomStrings();
       countChars();
        replaceChars();
    }
}