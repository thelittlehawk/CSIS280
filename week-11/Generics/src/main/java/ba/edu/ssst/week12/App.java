package ba.edu.ssst.week12;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Test");
//        names.add("Test123");
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(23);
//
//        ArrayList<Student> stuents = new ArrayList<>();
//        stuents.add(new Student("Test 1234"));
//        stuents.add(new Student("Test 123"));

        Group<Student> studentGroup = new Group<>();
        studentGroup.AddMember(new Student("First and Last name", 1));
        studentGroup.AddMember(new Student("Last and Last name", 2));
        studentGroup.AddMember(new Student("First and First name", 3));
        studentGroup.PrintReport();

        Group<Worker> workers = new Group<>();
        workers.AddMember(new Worker("Worker F L", 123123));
        workers.AddMember(new Worker("Worker F L", 123123));
        workers.AddMember(new Worker("Worker F L", 123123));
        workers.PrintReport();
    }
}
