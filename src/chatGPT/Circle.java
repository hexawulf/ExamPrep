package chatGPT;

public class Circle extends Shape
{
	//attributes
	int radius;
	
	//constructor
	public Circle(int radius) {
		this.radius = radius;
	}
	//Overriding of abstract method
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	//overriding toString method
	@Override
	public String toString() {
		return "Circle{radius=" + radius + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "}";
	}
}



