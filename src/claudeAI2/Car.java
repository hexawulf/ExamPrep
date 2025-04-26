package claudeAI2;

public class Car extends Vehicle {
private int numberOfDoors;


public Car() {
this("Unknown", 0, 0);
}

public Car(String manufacturer, int modelYear, int numberOfDoors) {
super(manufacturer, modelYear);
this.numberOfDoors = numberOfDoors;
}


@Override
public String toString() {
    return "Car{" +
            super.toString() +
            ", numberOfDoors=" + numberOfDoors +
            '}';
}
}