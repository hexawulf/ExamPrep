package claudeAI;
//Exercise 12: Abstract Classes
//Target Concept: Abstract classes and methods
//Create an abstract class Shape with an abstract method calculateArea(). Then create two concrete subclasses Circle and Square that implement the abstract method.

public class Q12 //Target concept: Method Overriding
{
    public static void main(String[] args) {
    	Shape circle = new Circle(6.0);
    	Shape square = new Square(4.0);
    	
    	System.out.println("Circle area: " + circle.calculateArea());
    	System.out.println("Square area: " + square.calculateArea());
    	
    	
    	
    }
}