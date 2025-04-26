package claudeAI2;

public class Vehicle {

private String manufacturer;
private int modelYear;


public Vehicle() {
this("Unknown", 0);
}

public Vehicle(String manufacturer, int modelYear) {
this.manufacturer=manufacturer;
this.modelYear = modelYear;
}

@Override
public String toString() {
    return "Vehicle{" +
            "manufacturer='" + manufacturer + '\'' +
            ", modelYear=" + modelYear +
            '}';

}}

