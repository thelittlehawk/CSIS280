package ba.edu.ssst.week03.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many grades you want to enter? ");
        int gradeCount = scanner.nextInt();

        Grade[] grades = new Grade[gradeCount];

        for (int increment = 0 ; increment < gradeCount ; increment++) {
            System.out.print(
                String.format("Please enter %d grade: ", increment + 1)
            );
            int tempGrade = scanner.nextInt();
            grades[increment] = new Grade(tempGrade);
        }

        GradeBook gradeBook = new GradeBook(grades);
        gradeBook.report();
    }
}
