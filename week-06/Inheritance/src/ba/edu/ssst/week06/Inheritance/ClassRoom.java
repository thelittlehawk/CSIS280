package ba.edu.ssst.week06.Inheritance;

import java.util.ArrayList;

public class ClassRoom {

    private String classroomName;

    private Teacher teacher;

    private ArrayList<Student> students;

    public ClassRoom(String classroomName) {
        this.classroomName = classroomName;
        this.students = new ArrayList<>();
        this.teacher = new Teacher("", "", 0);
    }

    public ClassRoom(String classroomName, Teacher teacher) {
        this.classroomName = classroomName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public ClassRoom(String classroomName, Teacher teacher, ArrayList<Student> students) {
        this.classroomName = classroomName;
        this.students = students;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printReport() {
        System.out.println("List of students in " + this.classroomName + " : ");
        System.out.println("Students:");
        for (Student s: this.students) {
            System.out.println(s);
        }
        System.out.println("Teacher: " + teacher);
    }

    @Override
    public String toString() {
        return this.classroomName + " has " + this.students.size() + " students";
    }
}
