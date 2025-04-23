package gemini25_2;
/*Exercise 7: Arithmetic Operators
Write a Java program (in a main method) that declares two integer variables, num1 with a value of 15 and num2 with a value of 4. Calculate and print the result of adding, subtracting, multiplying, and dividing num1 by num2. Also, calculate the remainder of the division.
Course-book Alignment: Unit 4, page 59    
Problem Statement: Perform basic arithmetic operations on two numbers and display the results.
Sample I/O:
Sum: 19
Difference: 11
Product: 60
Quotient: 3
Remainder: 3
Target concept: Arithmetic operators.*/

public class Q07
{

	public static void main(String[] args)
	{
		int num1, num2, result;
		num1 = 15;
		num2 = 4;
		result = 0;
		
		//adding
		result = num1 + num2;
		System.out.println("Sum: " +result);

		//subtracting
		result = num1 - num2;
		System.out.println("Difference: " +result);

		//multiplying
		result = num1 * num2;
		System.out.println("Product: " +result);

		//division of num1 by num2
		result = num1 / num2;
		System.out.println("Quotient: " +result);

		//remainder of division of num1 by num2
		result = num1 % num2;
		System.out.println("Remainder: " +result);

	}

}
