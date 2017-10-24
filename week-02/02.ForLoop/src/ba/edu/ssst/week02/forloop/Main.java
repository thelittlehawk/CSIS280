package ba.edu.ssst.week02.forloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students you want to create?");
        int numOfStudents = scanner.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            Student tempStudent = new Student("Student " + i, 0);
            students[i] = tempStudent;
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].getFullName());
        }
    }

    private void addScore()
    {
        Student student1 = new Student("Random Student", 0);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please add score (-1 to exit): ");
            int tempScore = scanner.nextInt();

            if(tempScore == -1)
                break;

            student1.add(tempScore);
            System.out.println("Status: " + student1.status());
        } while (true);

    }
}
