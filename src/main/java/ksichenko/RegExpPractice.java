package ksichenko;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {

    public static boolean getEmailTestResult(String testString) {

        final Pattern emailPattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        final Matcher testResult = emailPattern.matcher(testString);

        if (testResult.matches()) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");

        }
        return testResult.matches();
    }

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        System.out.print("Write email: ");
        final String email = in.nextLine();

        RegExpPractice.getEmailTestResult(email);
    }

}
