package ba.edu.ssst.week07.shapes;

public class Rectangle extends Shape {

    private int a;

    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }
}
