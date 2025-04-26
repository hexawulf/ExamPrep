package claudeAI2;

/*Exercise 15: Static Members
Create a class called MathUtility with a static attribute called PI with value 3.14159, and a static method called calculateCircleArea that takes a radius parameter and returns the area of the circle.
Target concept: Static attributes and methods (Unit 6, Section 6.3, pp. 99-102)*/
public class Q15
{

	public static void main(String[] args)
	{
		double result = MathUtility.calculateCircleArea(5.0);
		System.out.println(result);

	}

}
