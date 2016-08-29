package dshkliar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {
    final Pattern emailPattern = Pattern.compile
            ("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,3}");

    final public void checkEmail(final String email) {
        Matcher matcher = emailPattern.matcher(email.toLowerCase());
        if (matcher.matches()) {
            System.out.println("VALID");
        } else {
            System.out.println("INAVLID");
        }
    }
}
