package chatGPT;

public class Q18
{
//18. Abstract Class
//Topic: Abstraction
//Task: Create abstract class Shape with getArea(), and implement in Circle and Square.
//Target Concept: Abstract classes and methods.
	public static void main(String[] args)
	{
		Shape circle = new Circle(5);
		Shape square = new Square(4);
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Square area: " + square.getArea());
		
	}
}
