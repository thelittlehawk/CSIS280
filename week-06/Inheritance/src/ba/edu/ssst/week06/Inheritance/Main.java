package ba.edu.ssst.week06.Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Teacher("test", "test2", 10));
        p.add(new Student("test", "test", 20));


        System.out.println(p);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter classroom name:");
        String classroomName = scanner.next();

        System.out.println("Teacher first and last name:");
        String teacherFirstName = scanner.next();
        String teacherLastName = scanner.next();
        Teacher teacher = new Teacher(teacherFirstName, teacherLastName, 10);

        ClassRoom classRoom = new ClassRoom(classroomName, teacher);

        System.out.println("How many students you want to add?");
        int numberOfStudents = scanner.nextInt();

        for (int index = 0 ; index < numberOfStudents ; index++) {
            System.out.println("First name:");
            String firstName = scanner.next();

            System.out.println("Last name:");
            String lastName = scanner.next();

            System.out.println("Index:");
            Integer indexNumber = scanner.nextInt();

            Student student = new Student(firstName, lastName, indexNumber);
            classRoom.addStudent(student);
        }

        classRoom.printReport();
    }
}
