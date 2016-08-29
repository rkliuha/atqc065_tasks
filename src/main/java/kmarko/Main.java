package kmarko;

public class Main {
    public static void main(String[] args) {

        StringPractice test = new StringPractice();
        test.generateRandomArray();
        System.out.println(test.countOccurrences(test.newArray, 'A'));
        System.out.println(test.convertIntoOneString());
        System.out.println(test.countQuestionMarks());

    }
}
