package kmarko;

import java.util.Random;

class StringPractice {

    private String newString;
    String[] newArray = new String[50];
    final private int leftLimit = 65;
    final private int rightLimit = 90;
    final private int targetStringLength = 3;

/* This is used to create a random array with possible [A..Z] range */

    public void generateRandomArray() {
        for (int i = 0; i < newArray.length; i++) {

            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int)
                        (new Random().nextFloat() * (rightLimit - leftLimit));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();

            newArray[i] = generatedString;

            System.out.println(newArray[i]);
        }
    }

/* This is used to count the number of string that have “a” character in them */

    public int countOccurrences(final String[] testArray, final char character) {
        int count = 0;
        for (int i = 0; i < testArray.length; i++) {


            for (int j = 0; j < targetStringLength; j++) {
                if (testArray[i].charAt(j) == character) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public String convertIntoOneString() {

        StringBuilder builder = new StringBuilder();
        for (String s : newArray) {
            builder.append(s);
        }
        builder.toString();

        String newBuilder = new String(builder);

        newString = newBuilder.replaceAll("[AIEIOY]", "?");
        return newString;
    }

    public int countQuestionMarks() {
        int count = 0;

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == '?') {
                count++;
            }
        }
        return count;

    }

}


