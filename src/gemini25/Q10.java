package gemini25;
//Exercise 10: Simple if-else Statement
//Write a program that checks if a number is positive or negative using an if-else statement and prints the result.
//
//Course-book alignment: Unit 4, Section 4.4 (Page 65)    
//Target concept: if-else statement



public class Q10
{

	public static void main(String[] args)
	{
		int num1;
		num1 = -5;

		if (num1 >0) {

		    System.out.println("The provided integer " + num1 + " is positive.");
		}

		else {

		  System.out.println("The provided integer " + num1 + " is negative.");
		}
	}

}
