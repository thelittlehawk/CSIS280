package ba.edu.ssst.week06.Inheritance;

public class Person extends Object {

    private String firstName;

    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName;
    }
}
