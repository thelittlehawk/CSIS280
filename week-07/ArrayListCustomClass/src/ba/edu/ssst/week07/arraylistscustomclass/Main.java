package ba.edu.ssst.week07.arraylistscustomclass;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Person p = new Student("test", "test", new int[]{ 1, 2 ,3});

	    ArrayList<Person> persons = new ArrayList();

	    for (int counter = 0 ; counter < 10 ; counter++) {
            Random random = new Random();

            int[] testResults = new int[10];
            for (int testsCounter = 0 ; testsCounter < 10 ; testsCounter++) {
                testResults[testsCounter] = random.nextInt(100);
            }

            Student s = new Student(String.format("Student %d", counter + 1), "W last name", testResults);
            persons.add(s);
        }

        persons.add(new Driver("Driver 1", "Last name"));
        persons.add(new Driver("Driver 1", "Last name"));

        System.out.println("Avg:");
        for (Person person:
                persons) {

            if (person instanceof Student) {
                System.out.println(String.format("%.2f", ((Student) person).avg()));
            } else {
                System.out.println("Not an student.");
            }
        }

//        for (Person person:
//                persons) {
//            persons.report();
//        }

    }
}
