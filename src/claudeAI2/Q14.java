package claudeAI2;

/*Exercise 14: Polymorphism
Write a Java method called printShapeDetails that takes a parameter of type Shape and prints information about the shape, including its area. Show how this method can be called with different shape objects (Circle, Rectangle) to demonstrate polymorphic behavior.
Target concept: Polymorphism (Unit 6, Section 6.2, pp. 96-99)*/
public class Q14
{

	public static void main(String[] args)
	{

	        Circle circle = new Circle(5.0); // Create a Circle with radius 5.0
	        Rectangle rectangle = new Rectangle(4, 6); // Create a Rectangle with width 4 and height 6

	        printShapeDetails(circle);     // Pass Circle
	        System.out.println();          // Just a line break
	        printShapeDetails(rectangle);  // Pass Rectangle
	    } //end of main

//polymorphic method
public static void printShapeDetails(Shape shape) {
    System.out.println(shape.toString());
    System.out.println("Area: " + shape.calculateArea());
}

} //end of class
