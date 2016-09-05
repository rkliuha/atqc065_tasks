package okornienko;

import java.util.Random;

public class StringPractice {
    private static String unsortedString;
    private static int count;

    private static void createRandomStrings() {
        final String allSymbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final Random random = new Random();
        final StringBuilder stringOfChars = new StringBuilder();
        int select;

        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 10; i++) {
                select = random.nextInt(allSymbols.length());
                stringOfChars.append(allSymbols.charAt(select));
            }
            stringOfChars.append("\n");
        }
        unsortedString = stringOfChars.toString();
        System.out.println(unsortedString);
    }

    private static void countChars() {
        count = 0;
        for (int i = 0; i < unsortedString.length(); i++) {
            if (unsortedString.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Total count of a = " + count);
    }

    private static void replaceChars() {
        unsortedString = unsortedString.replaceAll("\n", "");
        unsortedString = unsortedString.replaceAll("[u,i,o,a,y,e]", "?");
        System.out.println(unsortedString);

        count = 0;
        for (int i = 0; i < unsortedString.length(); i++) {
            if (unsortedString.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Total count of ? = " + count);
    }

    public static void main(String[] args) {
        createRandomStrings();
        countChars();
        replaceChars();
    }
}