// This is most basic JAVA program in the world. It contains only one file with one command.
// By running this program you will see "Hello, world" string written to console.

// In JAVA everything is separated into packages. You can look at package at similar way
// as you look on the folders at your disk.
package ba.edu.ssst.week01.helloworld;

// Main code in JAVA application is located in Main class. To be more specific, application
// start execution from main method. Unlike C++, in JAVA everything is object and should be defined as class
public class Main {

    // This is main function in JAVA program. When you start application this function is called first.
    public static void main(String[] args) {

        // System class in JAVA is used for interacting with operating system that code is executed on.
        // In this specific case, we are telling command line interface (System.out) to print out string that
        // is sent to method.
        System.out.println("Hello, world! + 1234");
    }
}
