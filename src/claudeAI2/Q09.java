package claudeAI2;

/*Exercise 9: Nested Loops
Write a Java method that prints a pattern of asterisks forming a right-angled triangle with n rows, where n is a parameter passed to the method.
Example output for n=4:
*
**
***
****
Target concept: Nested control structures (Unit 4, Section 4.4, pp. 72-73)*/
public class Q09
{

	public static void main(String[] args)
	{
		 nestedLooper(50);

	} //end of psvm

	
	public static void nestedLooper(int n) {

		for (int i=1; i <=n; i++) { 
		    for (int j = 1; j <=i; j++) {
		    System.out.print("*");
		    }
		 System.out.println();
		}
	} // end of nestedLooper
	
	
} // end of class
