package ba.edu.ssst.week06.Inheritance;

public class Student extends Person {

    private Integer indexNumber;

    Student(String firstName, String lastName, Integer indexNumber) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + indexNumber + ")";
    }
}
