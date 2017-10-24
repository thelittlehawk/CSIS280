package ba.edu.ssst.week01.ifandswitch;

import java.util.Scanner;

// This program will demontrate usage of if and switch statements and will show
public class Main {

    public static void main(String[] args) {
        // Crete instance of scanner to collect input entered by user.
        Scanner scanner = new Scanner(System.in);

        // Program will expect from a user to enter mark [A, B, C, D or E] and based on that
        // print out range of points that needs to be collected during the semester.
        String mark = scanner.next();

        // Following if statement check if input string is equal to "A" and if so print out "91 -100" string
        // representing points range required for "A" mark. Following statement will fail because comparing object
        // with string in JAVA will compare if two given objects are identical, not if value/content is equal.
        // instead use .equal method available on String object.
        if (mark == "A")
            System.out.println("91 - 100");

        // Showing label that indicates that following output will be related to if statement.
        System.out.println("If output:");

        if (mark.equals("A+"))
            System.out.println("100");
        else {
            if (mark.equals("A"))
                System.out.println("91 - 100");
            else {
                if (mark.equals("B"))
                    System.out.println("81 - 90");
                else {
                    if (mark.equals("C"))
                        System.out.println("71 - 80");
                    else {
                        if (mark.equals("D"))
                            System.out.println("61 - 70");
                        else {
                            if (mark.equals("E"))
                                System.out.println("51 - 60");
                            else
                                System.out.println("I don't know");
                        }
                    }
                }
            }
        }

        // Showing label that indicates that following output will be related to switch statement.
        System.out.println("Switch output:");

        switch (mark) {
            case "A+":
                System.out.println("100");
                break;
            case "A":
                System.out.println("91 - 99");
                break;
            case "B":
                System.out.println("81 - 90");
                break;
            case "C":
                System.out.println("71 - 80");
                break;
            case "D":
                System.out.println("61 - 70");
                break;
            case "E":
                System.out.println("51 - 60");
                break;
            default:
                System.out.println("I don't know.");
        }

        System.out.println("== END ==");
    }
}
