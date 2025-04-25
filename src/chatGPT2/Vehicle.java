package chatGPT2;

public class Vehicle {

    // Attributes
    private String make;
    private int year;
    private double price;

    // Constructors
    public Vehicle() {
        this(null, 0, 0.0);
    }

    public Vehicle(String make, int year, double price) {
        this.make = make;
        this.year = year;
        this.price = price;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // A simple describe() method (no parameters)
    public String describe() {
        return "Make: " + make;
    }
}