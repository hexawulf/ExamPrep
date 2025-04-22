package chatGPT;

public class Vehicle
{
private String make;
private String model;
private int year;
private String color;

// Constructor
public Vehicle() {
	this.make = "Unknown";
	this.model = "Unknown";
	this.year = 0;
	this.color = "Unknown";
}

public Vehicle(String make, String model, int year, String color) {
	this.make = make;
	this.model = model;
	this.year = year;
	this.color = color;
}
// Getters and Setters
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
// Methods
public void start() {
	System.out.println("Vehicle is starting");
}
public void describe() {
	    System.out.println("This is a generic vehicle.");
	}

@Override
public String toString() {
	return "Vehicle{" +
			"make='" + make + '\'' +
			", model='" + model + '\'' +
			", year=" + year +
			", color='" + color + '\'' +
			'}';
}
}