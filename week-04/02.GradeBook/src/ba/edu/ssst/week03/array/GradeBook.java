package ba.edu.ssst.week03.array;

public class GradeBook {

    private Grade[] grades;

    public GradeBook(Grade[] grades) {
        this.grades = grades;
    }

    public void report() {
        System.out.print("Report");
        System.out.print("==================");
        System.out.print("Grades: ");
        System.out.print(this.grades[0]);
        for (int increment = 1 ; increment < this.grades.length ; increment++) {
            String result = ", " + this.grades[increment].toString();
            System.out.print(result);
        }
        System.out.println(".");

        System.out.println("Maximum grade: " + this.max());
        System.out.println("Minimum grade: " + this.min());
        System.out.println("Average: " + this.avg());
    }

    private int sum() {
        int sum = 0;
        for (Grade grade: this.grades) {
            sum += grade.getGrade();
        }
        return sum;
    }

    private double avg() {
        return this.sum() / this.grades.length;
    }

    private Grade min() {
        Grade minGrade = this.grades[0];
        for (Grade grade : this.grades) {
            if (grade.getGrade() < minGrade.getGrade()){
                minGrade = grade;
            }
        }
        return minGrade;
    }

    public Grade max() {
        Grade maxGrade = this.grades[0];
        for (int increment = 1 ; increment < this.grades.length ; increment++) {
            if (this.grades[increment].getGrade() > maxGrade.getGrade()){
                maxGrade = this.grades[increment];
            }
        }
        return maxGrade;
    }

}