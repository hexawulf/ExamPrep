package abacusAI;

public class Q20
{

	public static void main(String[] args)
	{
//		20. Copy Constructor
//		Problem:
//		Add a copy constructor to a class Point that copies the values from another Point object.
//
//		Targeted Concept:
//		Copy Constructors – Creating a new object as a copy of another.

		Point point1 = new Point(10, 20);
		Point point2 = new Point(point1); // Using the copy constructor
		System.out.println("Point 1: " + point1); // Shorthand for System.out.println(point1.toString());
		System.out.println("Point 2 (copy of Point 1): " + point2); // Shorthand for System.out.println(point2.toString());
		
	}

}
