package ba.edu.ssst.week02.arraymanipulation;

public class Student {

    private String firstName;

    private String lastName;

    private Integer points;

    public Student(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, int points) {
        this.firstName = firstName;
        this.points = points;
    }

    public Student(int points, String lastName) {
        this.firstName = firstName;
        this.points = points;
    }
}
