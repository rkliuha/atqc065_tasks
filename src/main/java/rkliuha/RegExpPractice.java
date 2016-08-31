package rkliuha;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {

    public static final String checkCriteria = "^[a-zA-Z0-9]+\\@[a-zA-Z0-9]"
            + "+\\.[a-zA-Z]{2,3}$";

    public static void main(final String[] args) {

        final String email = getEmailFromUser();
        final boolean validationResult = getEmailValidation(email);
        showValidationMessage(validationResult);

    }

    public static final boolean getEmailValidation(final String email) {
        final Pattern pattern = Pattern.compile(checkCriteria);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static final String getEmailFromUser() {
        System.out.println("Set an email: ");
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static final void showValidationMessage(final boolean
                                                           validationResult) {
        if (validationResult) {
            System.out.println("Your email is: VALID");
        } else {
            System.out.println("Your email is: INVALID");
        }
    }

}
