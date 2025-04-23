package gemini25_2;

/*Exercise 6: Variable Declaration and Assignment
Write a Java program (in a main method) that declares an integer variable count, assigns it the value 5, then reassigns it the value 10. Print the value of count after each assignment.
Course-book Alignment: Unit 4, page 57    
Problem Statement: Declare a variable and demonstrate variable assignment and reassignment.
Sample I/O:
Initial count: 5
Updated count: 10*/
public class Q06
{

	public static void main(String[] args)
	{
		int num1;
		num1 = 5;
		System.out.println("Initial count: " + num1);
		num1 = 10;
		System.out.println("Updated count: " + num1);
	}

}
