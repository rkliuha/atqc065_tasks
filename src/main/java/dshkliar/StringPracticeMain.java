package dshkliar;

public class StringPracticeMain {
    public static void main(String[] args) {
        final StringPractice myString = new StringPractice();
        myString.setStringArray();
        myString.count();
        System.out.println("\nMy joined String: " + "\n" + myString.joinArray());
        myString.replace();
        myString.countQuestionMarks();
    }
}
