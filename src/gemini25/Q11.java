package gemini25;
//Exercise 11: Nested if-else Statements
//Write a program that checks if a number is positive, negative, or zero using nested if-else statements.
//
//Course-book alignment: Unit 4, Section 4.4 (Page 67)    
//Target concept: Nested if-else statements


public class Q11
{

	public static void main(String[] args)
	{
		int num1;
		num1 =5;


		if (num1 == 0) {
		    System.out.println("The provided integer " + num1 + " is zero.");
		}
		else if (num1 >0) {

		  System.out.println("The provided integer " + num1 + " is positive.");
		  
		  }
		  
		else {

		System.out.println("The provided integer " + num1 + " is negative.");

		}
}
}
