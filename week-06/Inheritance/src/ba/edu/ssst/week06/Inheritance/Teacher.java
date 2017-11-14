package ba.edu.ssst.week06.Inheritance;

public class Teacher extends Person {

    private Integer yearsOfExperience;

    public Teacher(String teacherFirstName, String teacherLastName, Integer yearsOfExperience) {
        super(teacherFirstName, teacherLastName);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + this.yearsOfExperience + " years of experience.";
    }
}
