package dpapshev.oop_task.RegExPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPractice {
    public static void main(String[] args) {
        final String pattern = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[a-z]{2,3}$";

        System.out.println("Enter Email please: ");
        final Scanner input = new Scanner(System.in);
        final String text = input.nextLine();
        final Pattern sample = Pattern.compile(pattern);
        final Matcher matcher = sample.matcher(text);
        if (matcher.matches()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
