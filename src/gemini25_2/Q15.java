package gemini25_2;
/*Exercise 15: Do-While Loop
Write a Java program (in a main method) that uses a do-while loop to print the numbers from 10 down to 8 (inclusive).
Course-book Alignment: Unit 4, page 70    
Problem Statement: Execute a loop body at least once before checking the condition using a do-while loop.
Sample I/O:
10
9
8
Target concept: do-while loop.*/

public class Q15
{

	public static void main(String[] args)
	{
		
		int index = 10;
		do {
			System.out.println(index);
			index--;
		} while (index >=8);

	}

}
