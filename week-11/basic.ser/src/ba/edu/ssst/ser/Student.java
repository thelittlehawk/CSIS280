package ba.edu.ssst.ser;

import java.io.Serializable;

public class Student implements Serializable {
    private final String firstName;

    private final String lastName;

    private final Index index;

    public Student(String firstName, String lastName, int indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = new Index(indexNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Index getIndex() {
        return index;
    }
}
