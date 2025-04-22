package chatGPT;

public class Square extends Shape
{
	
	//attributes
	int side;
	
	//constructor
	public Square(int side) {
		this.side = side;
	}
	//Overriding of abstract method
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return 4 * side;
	}
	
	@Override
	public String toString() {
		return "Square{side=" + side + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "}";
	}
}
