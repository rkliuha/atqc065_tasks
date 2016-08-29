package kmarko;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {

    private Matcher matcher;

    private Pattern pattern = Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,3}");

    final public void validateEmail(final String email) {

        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
}
