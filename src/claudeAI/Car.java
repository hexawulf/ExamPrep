package claudeAI;
public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public String getModel() { return model; }

    @Override
    public void displayInfo() {
        super.displayInfo(); // prints brand and year
        System.out.println("Model: " + model);
    }
}
