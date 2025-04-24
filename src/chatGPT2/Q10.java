package chatGPT2;
/*Exercise 10: Arrays and Access
Task: Declare an array of 5 integers and print the first and last element.
Course-book alignment: Unit 3, Section 3.3 and Session 3 PDF
Target concept: Array creation and access*/

public class Q10
{

	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		System.out.println(intArray[0] + " " + intArray[4]);

	}

}
