package ba.edu.ssst.week07.shapes;

public class Circle extends Shape {

    private int radios;

    public Circle(String name) {
        super(name);
        this.radios= 1;
    }

    public Circle(String name, int radios) {
        super(name);
        this.radios = radios;
    }

    @Override
    public double area() {
        return Math.pow(radios, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Shape.... O");
    }
}
