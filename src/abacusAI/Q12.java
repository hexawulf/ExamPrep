package abacusAI;

public class Q12
{

	public static void main(String[] args)
	{
//		12. Static Method
//		Problem:
//		Create a static method add that takes two integers and returns their sum.
//
//		Example Input:
//		add(2, 3)
//		Example Output:
//		5
//
//		Targeted Concept:
//		Static Methods – Defining and using static methods.
		int num1 = 10;
		int num2 = 5;
		int result = addIntegers(num1, num2);
		System.out.println(result);
	} // end of psvm
	static int addIntegers(int num1, int num2)
	{ int a = num1+num2;
	return a;}
	// end of addIntegers
} // end of class
