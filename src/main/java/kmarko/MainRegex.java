package kmarko;

import java.util.Scanner;

public class MainRegex {

    public static void main(String[] args) {

        Scanner emailCheck = new Scanner(System.in);
        String email = emailCheck.next();

        RegExpPractice emailValidation = new RegExpPractice();
        emailValidation.validateEmail(email);
    }
}
