package rkliuha;

public class StringPractice {

    public static final StringBuilder[] words = new StringBuilder[50];

    public static void main(final String[] args) {

        fillOutRandom(words);
        System.out.println("Array is filled out:");
        for (final StringBuilder word : words) {
            System.out.println(word);
        }

        final int countOfSymbol = getCountOfSymbol(words, "o");
        System.out.println("\nNumber of counted strings include symbol: \n"
                + countOfSymbol);

        final String comboString = getOneLineString(words);

        System.out.println("\nOne-line String is filled from Array: \n"
                + comboString);

        final String replacedVowelsString = getReplacedVowelsTo(comboString, '?');
        System.out.println("\nThe String after replacement: \n" + replacedVowelsString);

        final int countOfChar = getCountOfChar(replacedVowelsString, '?');
        System.out.println("\nNumber of counted chars: \n" + countOfChar);

    }

    public static final void fillOutRandom(final StringBuilder[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder("");
            for (int k = 0; k < ((Math.random() + 1) * 5); k++) {
                final char temp = (char) ((Math.random() + 5) * 20);
                words[i].append(temp);
            }
        }
    }

    public static final int getCountOfSymbol(final StringBuilder[] words,
                                             final String symbol) {
        int count = 0;
        for (final StringBuilder word : words) {
            if (word.toString().contains(symbol)) {
                count++;
            }
        }
        return count;
    }

    public static final String getOneLineString(final StringBuilder[] words) {
        final StringBuilder temporaryString = new StringBuilder();
        for (final StringBuilder word : words) {
            temporaryString.append(word + " ");
        }
        return temporaryString.toString();
    }

    public static final String getReplacedVowelsTo(String comboString,
                                                   final char forVowelsReplacement) {
        final char[] vowels = {'u', 'i', 'o', 'a', 'y', 'e'};
        for (int j = 0; j < vowels.length; j++) {
            comboString = comboString.replace(vowels[j],
                    forVowelsReplacement);
        }
        return comboString;
    }

    public static final int getCountOfChar(final String replacedVowelsString,
                                           final char forCount) {
        int countChar = 0;
        for (int i = 0; i < replacedVowelsString.toCharArray().length; i++) {
            if (replacedVowelsString.toCharArray()[i] == forCount) {
                countChar++;
            }
        }
        return countChar;
    }

}
