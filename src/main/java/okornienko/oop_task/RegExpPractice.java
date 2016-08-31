package okornienko.oop_task;

import java.util.Scanner;

public class RegExpPractice {
    public static void main(String[] args) {
        final String pattern = "[A-Za-z0-9]+" + "@" + "[A-Za-z0-9]+" + "." + "[A-Za-z0-9]{2,3}";
        final Scanner reedline = new Scanner(System.in);
        System.out.print("Enter valid email address: ");
        if (reedline.hasNext(pattern)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        reedline.close();
    }
}
