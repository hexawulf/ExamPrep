package claudeAI2;
/*Exercise 7: For Loop Implementation
Write a Java method called sumNumbers that takes an integer parameter n and returns the sum of all integers from 1 to n (inclusive).
Target concept: For loop structure (Unit 4, Section 4.4, pp. 69-72)*/

public class Q07
{

	public static void main(String[] args)
	{
		sumNumbers(50);

	} //end of psvm
	
	
	public static void sumNumbers(int n) {
		int i = 0;
		for (i=0; i<=n; i++) {
		System.out.println(i);
		}
	}
	
	
	
} //end of class Q07
