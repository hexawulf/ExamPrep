package claudeAI2;
/*Exercise 18: Exception Handling
Write a Java method called divideNumbers that takes two integer parameters and returns their quotient. Use a try-catch block to handle the potential ArithmeticException that could occur if the second parameter is zero. If an exception occurs, return 0.
Target concept: Exception handling with try-catch blocks (Unit 8, Section 8.2, pp. 119-123)*/

public class Q18
{

	public static void main(String[] args)
	{
	     	System.out.println(divideNumbers(5, 0));  // Should print 0
	        System.out.println(divideNumbers(10, 2)); // Should print 5

	} // end of psvm

	
    public static int divideNumbers(int num1, int num2) {
        try {
            int result = num1 / num2;
            return result;
        } catch (ArithmeticException ex) {
            return 0;  // Return 0 if division by zero happens
        }
    }
	
} // end of class
