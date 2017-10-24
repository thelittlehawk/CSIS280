package ba.edu.ssst.week02.cliinputs;

// Import statement is used for bringing in classes from other packages
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner class will give you option to take inputs from user. Scanner class constructor
        // accepts one parameter that represent source where information will be entered.
        Scanner scanner = new Scanner(System.in);

        // At this example we are printing out string "First name: " in order to better describe
        // to the user what type of input we expect.
        System.out.println("First name :");
        // On this line we are assigning what is entered by user and saving input to newly created
        // variable firstName. By calling scanner.next() program will stop execution and will
        // wait for input from a user. Once user pres RETURN key, text will be saved to firstName variable
        // and program will continue execution.
        String firstName = scanner.next();

        // Similar approach is used here, just this time we are asking for users last name.
        System.out.println("Last name :");
        String lastName = scanner.next();

        // This is almost the same as first and last name inputs except that we ask for age. This time
        // text that is entered will be saved as integer instead of string. We will use nextInt method
        // from scanner instance to ensure only number is stored.
        System.out.println("Age :");
        Integer age = scanner.nextInt();


        // Once we have gathered information from input, we can arrange them so we can nicely display
        // back to the user. This can be done in two different ways.

        // First one is to concatenate strings by using + operator. This is done similar way as we add
        // numbers, just this time we use strings. When string is added to the number, number is converted
        // to the string. In this case, age is converted from interger to string and concatenated with
        // other strings.
        String output = firstName + ", " + lastName + " and s/he is " + age + " years old.";

        // Second way to prepare string for printing/displaying is by using function from String class
        // called format. Format function accepts string as a first parameter, this string will represent
        // final output that will be shown to the user. Format string is followed by variables that are
        // substituted in format string where % with letter appears.
        // In our example we have format string containing three different occupancies of % and letter combination.
        // %s represents placeholder for string that will be sent to the function after format string and %d is used
        // for numbers.
        String outputFormated = String.format(
                "%s, %s and s/he is %d years old.",
                firstName,
                lastName,
                age);

        System.out.println(output);
        System.out.println(outputFormated);
    }
}
