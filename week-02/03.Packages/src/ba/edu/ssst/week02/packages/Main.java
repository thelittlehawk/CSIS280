package ba.edu.ssst.week02.packages;

public class Main {

    public static void main(String[] args) {
        ClassA a = new ClassA();

        // Call class by directly specifying package
        ba.edu.ssst.week02.packages.core.ClassB c = new ba.edu.ssst.week02.packages.core.ClassB();
    }
}
