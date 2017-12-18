package ba.edu.ssst.Student;

public class Student {

    private String firstname;

    private String lastname;

    public Student(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
