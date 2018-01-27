package ba.edu.ssst.Student;

public class Pet implements IInventoryItem {

    private String name;

    private String type;

    private String color;

    private double price;

    public Pet(String name, String type, String color, double price) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double ItemgetPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.type;
    }
}
