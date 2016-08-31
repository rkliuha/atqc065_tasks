package kmarko;

import java.util.Random;

class StringPractice {

    final private int targetStringLength = 3;
    private String newString;
    String[] newArray = new String[50];

/* This method is used to create a random array
    with possible [A..Z] range  and print it*/

    public void task_5_2() {

        final int leftLimit = 65;
        final int rightLimit = 90;

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

/* This method is used to count the number of string
    that have “a” character and printing them out */

    public void task_5_3(final String[] testArray, final char character) {
        int count = 0;
        for (String aTestArray : testArray) {
            for (int j = 0; j < targetStringLength; j++) {
                if (aTestArray.charAt(j) == character) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("The number of 'A' occurrences in array: " + count);
    }

/*This method is used for combining all strings
    from array into one and for replacement of
    all vowels with question marks, and it prints out the result */

    public void task_5_4() {

        StringBuilder builder = new StringBuilder();
        for (String element : newArray) {
            builder.append(element);
        }
        builder.toString();

        String newBuilder = new String(builder);

        newString = newBuilder.replaceAll("[AIEUOY]", "?");
        System.out.println(newString);
    }

/*This method is used for counting the number of question marks and
    printing the number of occurrences out*/

    public void task_5_5() {
        int count = 0;

        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("The number of question marks found: " + count);
    }

    public static void main(String[] args) {

        final StringPractice test = new StringPractice();
        test.task_5_2();
        test.task_5_3(test.newArray, 'A');
        test.task_5_4();
        test.task_5_5();
    }
}
