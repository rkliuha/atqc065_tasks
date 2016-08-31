package kmarko;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {

    final private Pattern pattern = Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,3}");

    final public void validateEmail(final String email) {

        final Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("This email is VALID");
        } else {
            System.out.println("This email is INVALID");
        }
    }

    public static void main(String[] args) {

        final Scanner emailCheck = new Scanner(System.in);
        final String email = emailCheck.next();

        final RegExpPractice emailValidation = new RegExpPractice();
        emailValidation.validateEmail(email);
    }
}
