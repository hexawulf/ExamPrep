package chatGPT2;

/*12. Fraction Class
Problem: Define a Fraction class and add methods for addition, subtraction, multiplication, and division.
Course-book alignment: Unit 3, Section 3.4 (Methods); Session 5 Transfer Task 2
Target concept: Class with multiple instance methods*/
public class Q12
{

	public static void main(String[] args)
	{
		// Create an instance of the Fraction class and call its methods
			Fraction fraction1 = new Fraction();
			System.out.println("Addition: " + fraction1.addMethod(10, 5));
			System.out.println("Subtraction: " + fraction1.subMethod(10, 5));
			System.out.println("Multiplication: " + fraction1.multMethod(10, 5));
			System.out.println("Division: " + fraction1.divMethod(10, 5));
			System.out.println("Remainder: " + fraction1.modMethod(10, 5));
		} // End of main method
	} // End of Q12 class


