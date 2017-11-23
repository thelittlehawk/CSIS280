package ba.edu.ssst.week08.playground;

public class Circle implements IShape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double convert(double input) {
        return 0;
    }
}

public class CircleA extends Shape {

    public CircleA(String name) {
        super(name);
    }

}
