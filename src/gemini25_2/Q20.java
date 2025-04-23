package gemini25_2;
/*Exercise 20: Exception Handling with Try-Catch
Write a Java program (in a main method) that attempts to divide an integer by zero. Use a try-catch block to catch the ArithmeticException that occurs and print an informative error message instead of letting the program crash.
Course-book Alignment: Unit 8, page 119    
Problem Statement: Implement exception handling for a potential runtime error using a try-catch block.
Sample I/O:
An error occurred: Division by zero is not allowed.
Target concept: Exception handling (try-catch).*/

public class Q20
{

	public static void main(String[] args)
	{
		int num1, num2, result;
		num1 = 100;
		num2 = 0;

		try {
		result=num1/num2;
		System.out.println("The result is: " + result);
		} catch (ArithmeticException e) {
		
		System.out.println("Error: Division by zero is not allowed.");

		}
		finally {
			System.out.println("This is the finally block, it always executes.");
		}


	}

}
