package dshkliar;

import java.util.Random;

public class StringPractice {
    protected String[] stringArray = new String[50];
    protected int lowerBound = 48; // digit '0'
    protected int upperBound = 122; // letter 'z'
    protected int stringLength = 10;
    protected String generatedString;
    protected String joinedString;


    public void setStringArray() {
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringRandom();
            System.out.println(i + " - " + stringArray[i]);
        }
    }

    public String stringRandom() {
        StringBuilder buffer = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = lowerBound + (int) (new Random().nextDouble() * (upperBound - lowerBound));
            buffer.append((char) randomLimitedInt);
        }
        generatedString = buffer.toString();
        return generatedString;
    }

    public void count() {
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (stringArray[i].charAt(j) == 'a') {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("\ncount of 'a': " + counter);
    }

    public String joinArray() {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < stringArray.length; i++) {
            result.append(stringArray[i]);
        }
        joinedString = result.toString();
        return result.toString();
    }

    public void replace() {                                             //  another we can use replaceAll("[uioaye]", "?"
        char[] vowels = {'u', 'i', 'o', 'a', 'y', 'e'};
        for (int i = 0; i < joinedString.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                joinedString = joinedString.replace(vowels[j], '?');
            }
        }
        System.out.println("\nMy changed joined String: " + "\n" + joinedString);
    }

    public void countQuestionMarks() {
        int count = 0;
        for (int i = 0; i < joinedString.length(); i++) {
            if (joinedString.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Length of String: " + joinedString.length() + "\nCount of Question marks: " + count);
    }

}
