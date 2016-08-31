package okornienko;

import java.util.Scanner;

public class RegExpPractice {
    public static void main(String[] args) {
        final String pattern = "[A-Za-z0-9]+" + "@" + "[A-Za-z0-9]+" + "." + "[A-Za-z0-9]{2,3}";
        final Scanner readline = new Scanner(System.in);
        System.out.print("Enter valid email address: ");
        if (readline.hasNext(pattern)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        readline.close();
    }
}
