package ba.edu.ssst.week02.fizzbuzz;

import java.util.Scanner;

public class Main {

    // This program demonstrats solving of FizzBuzz problem in JAVA
    //
    // FizzBuzz problem:
    // Print the numbers 1..100
    // For multiples of 3, print "Fizz" instead of the number
    // For multiples of 5, print "Buzz" instead of the number
    // For multiples of 3 and 5, print "FizzBuzz" instead of the number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int inc = 1 ; inc <= 100 ; inc++) {
            if (inc % 3 == 0 && inc % 5 == 0)
                System.out.print("FizzBuzz, ");
            else {
                if (inc % 3 == 0) {
                    System.out.print("Fizz, ");
                } else {
                    if (inc % 5 == 0) {
                        System.out.print("Buzz, ");
                    } else {
                        System.out.print(inc + ", ");
                    }
                }
            }
        }
    }
}
