package ksichenko.oop_task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {

    public static boolean emileTest(String testString) {

        Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        Matcher testResult = pattern.matcher(testString);

        if (testResult.matches() == true) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        return testResult.matches();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Write emile: ");
        String emile = in.nextLine();

        RegExpPractice.emileTest(emile);
    }

}
