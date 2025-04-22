package chatGPT;

public class Car extends Vehicle
{
private int numberOfDoors;
private String fuelType;
private boolean isElectric;

// Constructor
public Car() {
	super();
	this.numberOfDoors = 4;
	this.fuelType = "Gasoline";
	this.isElectric = false;
}
public Car(String make, String model, int year, int numberOfDoors, String fuelType, boolean isElectric) {
	super(make, model, year, "Unknown");
	this.numberOfDoors = numberOfDoors;
	this.fuelType = fuelType;
	this.isElectric = isElectric;
}
//Override Methods
@Override
public void start() {
		System.out.println("Car is starting");
	}

@Override
public void describe() {
    System.out.println("This is a car with " + numberOfDoors + " doors. Fuel type: " + fuelType + 
                       ". Electric: " + (isElectric ? "Yes" : "No") + ".");
}

@Override
public String toString() {
    return super.toString().replace("}", "") +  // Use Vehicle's toString and remove closing }
            ", numberOfDoors=" + numberOfDoors +
            ", fuelType='" + fuelType + '\'' +
            ", isElectric=" + isElectric +
            '}';
}


}