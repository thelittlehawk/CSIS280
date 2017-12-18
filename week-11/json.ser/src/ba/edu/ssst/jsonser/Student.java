package ba.edu.ssst.jsonser;

import java.io.Serializable;

public class Student implements Serializable {
    private final String firstName;

    private final String lastName;

    private final int index;

    public Student(String firstName, String lastName, int indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIndex() {
        return index;
    }
}
