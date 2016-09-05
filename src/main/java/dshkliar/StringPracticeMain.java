package dshkliar;

public class StringPracticeMain {
    public static void main(String[] args) {

        final StringPractice myString = new StringPractice(50);
        final char[] vowels = {'u', 'i', 'o', 'a', 'y', 'e'};
        final char symbol = '?';
        final int upperBound = 48;
        final int lowerBound = 122;
        final int stringLength = 10;

        myString.task_5_2(stringLength, upperBound, lowerBound);
        myString.task_5_3('a');
        myString.task_5_4(vowels, symbol);
        myString.task_5_5(symbol);
    }
}
