package ba.edu.ssst.week03.array;

public class Grade {

    private int grade;

    public Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        if (grade > 0) {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return grade + "";
    }
}
