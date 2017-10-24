package ba.edu.ssst.week02.forloop;

public class Student {

    private String fullName;

    private int score;

    public Student(String fullName, int score)
    {
        this.fullName = fullName;

        this.score = score >= 0 ? score : 0;
    }

    public boolean add(int addScore)
    {
        if (addScore > 0) {
            this.score += addScore;
            return true;
        }
        return false;
    }

    public String status()
    {
        if (this.score >= 51)
            return "Pass";
        return "Failed";
    }

    public String getFullName() {
        return fullName;
    }
}
