package claudeAI2;
/*Exercise 8: While Loop Implementation
Write a Java method called findDigitCount that takes an integer parameter and returns the number of digits in that integer using a while loop.
Target concept: While loop implementation (Unit 4, Section 4.4, pp. 69-71)*/


public class Q08
{

	public static void main(String[] args)
	{
		int digitCount = findDigitCount(12345);
		System.out.println("Number of digits: " + digitCount);	
	
	
	} // end of psvm 	
	
	public static int findDigitCount(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10; // Remove the last digit
			count++; // Increment the count
		}
		return count;
	}
}
