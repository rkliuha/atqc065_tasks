package dshkliar;

import java.util.Random;

public class StringPractice {
    private final String[] stringArray;
    //    private final int lowerBound = 48; // digit '0'
//    private final int upperBound = 122; // letter 'z'
//    private final int stringLength = 10;
    private String joinedString;

    StringPractice(final int arrayLength) {
        this.stringArray = new String[arrayLength];
    }

    /*TASK 5.2 - Create an array of 50 random strings. Print out the array.
      methods: task_5_2 & getRandomString*/
    public void task_5_2(final int stringLength, final int lowerBound, final int upperBound) {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = getRandomString(stringLength, lowerBound, upperBound);
            System.out.println(i + " - " + stringArray[i]);
        }
    }

    public String getRandomString(final int stringLength, final int lowerBound, final int upperBound) {
        final StringBuilder buffer = new StringBuilder(stringLength);
        final String randomString;
        for (int i = 0; i < stringLength; i++) {
            final int randomInt = lowerBound + (int) (new Random().nextDouble() * (upperBound - lowerBound));
            buffer.append((char) randomInt);
        }
        randomString = buffer.toString();
        return randomString;
    }

    /*TASK 5.3 - Count the number of string that have “a” in them. Print out the result.*/
    public void task_5_3(final char a) {
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (stringArray[i].charAt(j) == a) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("\nCount of " + a + ": " + counter);
    }

    /*TASK 5.4 - Combine all the strings from the array into one string.
                 Replace all vowels (u, i, o, a, y, e) with question marks.
                 Print out the combined string.
      methods: task_5_4 & replaceSomeCharsInString*/
    public void task_5_4(final char[] vowels, final char surrogate) {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            result.append(stringArray[i]);
        }
        joinedString = result.toString();
        System.out.println("\nJoined strings: " + "\n" + joinedString);
        replaceSomeCharsInString(vowels, surrogate);
    }

    public void replaceSomeCharsInString(final char[] vowels, final char surrogate) {                //  also we can use replaceAll("[uioaye]", "?"
        for (int i = 0; i < joinedString.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                joinedString = joinedString.replace(vowels[j], surrogate);
            }
        }
        System.out.println("My changed joined String: " + "\n" + joinedString);
    }

    /*TASK 5.5 - Count question marks number, print out the number.*/
    public void task_5_5(final char symbol) {
        int count = 0;
        for (int i = 0; i < joinedString.length(); i++) {
            if (joinedString.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println("\nLength of String: " + joinedString.length() + "\nCount of " + symbol + ": " + count);
    }
}
