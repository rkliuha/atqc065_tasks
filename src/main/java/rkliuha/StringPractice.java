package rkliuha;

public class StringPractice {

    public static final String[] words = new String[50];

    public static void main(final String[] args) {

        fillOutRandom(words);
        System.out.println("Array is filled out:");
        for (final String d : words) {
            System.out.println(d);
        }

        final int countOfSymbol = getCountOfSymbol(words, "o");
        System.out.println("\nNumber of counted strings include symbol: \n"
                + countOfSymbol);

        String comboString = getOneLineString(words);

        System.out.println("\nOne-line String is filled from Array: \n"
                + comboString);

        comboString = getReplacedVowelsTo(comboString, '?');
        System.out.println("\nThe String after replacement: \n" + comboString);

        final int countOfChar = getCountOfChar(comboString, '?');
        System.out.println("\nNumber of counted chars: \n" + countOfChar);

    }

    public static final void fillOutRandom(final String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = " ";
            for (int k = 0; k < ((Math.random() + 1) * 5); k++) {
                final char temp = (char) ((Math.random() + 5) * 20);
                words[i] += temp;
            }
        }
    }

    public static final int getCountOfSymbol(final String[] words,
                                             final String symbol) {
        int count = 0;
        for (final String y : words) {
            if (y.contains(symbol)) {
                count++;
            }
        }
        return count;
    }

    public static final String getOneLineString(final String[] words) {
        String comboString = "";
        for (final String d : words) {
            comboString += d;
        }
        return comboString;
    }

    public static final String getReplacedVowelsTo(String comboString,
                                                   final char forVowelsReplacement) {
        final char[] vowels = {'u', 'i', 'o', 'a', 'y', 'e'};
        for (int i = 0; i < comboString.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                comboString = comboString.replace(vowels[j],
                        forVowelsReplacement);
            }
        }
        return comboString;
    }

    public static final int getCountOfChar(final String comboString,
                                           final char forCount) {
        int countChar = 0;
        for (int i = 0; i < comboString.toCharArray().length; i++) {
            if (comboString.toCharArray()[i] == forCount) {
                countChar++;
            }
        }
        return countChar;
    }

}
