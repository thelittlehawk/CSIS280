package ba.edu.ssst.week07.shapes;

public abstract class Shape implements IShape {

    final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public void draw() {
        System.out.println("Shape.... | |");
    }
}
