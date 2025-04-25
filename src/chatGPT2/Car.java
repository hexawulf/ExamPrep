package chatGPT2;

public class Car extends Vehicle {

    // Extra attribute
    private String model;

    // Constructors
    public Car() {
        this(null, null, 0, 0.0);
    }

    public Car(String make, String model, int year, double price) {
        super(make, year, price); // Call the Vehicle constructor
        this.model = model;       // Set Car-specific attribute
    }

    // Override the describe() method
    @Override
    public String describe() {
        return "Car: " + getMake() + " " + model;
    }
}
