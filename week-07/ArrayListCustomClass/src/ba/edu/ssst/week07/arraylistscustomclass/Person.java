package ba.edu.ssst.week07.arraylistscustomclass;

public abstract class Person {

    final String firstName;

    final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.firstName, this.lastName);
    }
}
