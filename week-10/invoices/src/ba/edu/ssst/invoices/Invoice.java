package ba.edu.ssst.invoices;

public class Invoice {

    private String name;

    private Double value;

    public Invoice(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }
}

