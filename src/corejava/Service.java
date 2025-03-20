package corejava;

public class Service {
    private String name;
    private double price;

    public Service( String name,double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
