package dshkliar;

import java.util.Scanner;

public class RegExpPracticeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scan.next();
        final RegExpPractice regExp = new RegExpPractice();
        regExp.checkEmail(email);
    }
}
