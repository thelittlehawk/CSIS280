package ba.edu.ssst.week07.arraylistscustomclass;

public class Student extends Person {

    private int[] tests;

    public Student(String firstName, String lastName, int[] tests) {
        super(firstName, lastName);
        this.tests = tests;
    }

    public void report() {
        System.out.print(String.format("%s, %s has following test results: ", this.firstName, this.lastName));
        for (int counter = 0 ; counter < tests.length ; counter++) {
            System.out.print(String.format("%d ", this.tests[counter]));
        }
        System.out.println();
    }

    public double avg() {
        int sum = 0;

        for (int index = 0 ; index < tests.length ; index++) {
            sum += this.tests[index];
        }

        return sum / this.tests.length;
    }
}
