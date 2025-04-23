package gemini25_2;
/*Exercise 11: If-Else Statement
Write a Java program (in a main method) that declares an integer variable temperature and sets its value to 25. Use an if-else statement to print "It's warm!" if the temperature is greater than 20, and "It's cool." otherwise.
Course-book Alignment: Unit 4, page 65    
Problem Statement: Implement a conditional statement to perform different actions based on a single condition.
Sample I/O (for temperature = 25):
It's warm!
Target concept: if-else statement.*/

public class Q11
{

	public static void main(String[] args)
	{
		int temperature;
		temperature = 25;

		if (temperature >20) {

		  System.out.println("It's warm!");

		} else {

		 System.out.println("It's cool!");
		 
		}

	}

}
