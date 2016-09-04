package dshkliar;

import java.util.Scanner;

public class RegExpPracticeMain {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter your email: ");
        final String email = scan.next();
        final RegExpPractice regExp = new RegExpPractice();
        regExp.checkEmail(email);
    }
}
