package ba.edu.ssst.week12;

public class Student implements IGroupMemeber {

    private String name;

    private int memberId;

    public Student(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student: " + this.name;
    }

    @Override
    public int MemberId() {
        return this.memberId;
    }
}
