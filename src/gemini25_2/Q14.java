package gemini25_2;
/*Exercise 14: While Loop
Write a Java program (in a main method) that uses a while loop to print the numbers from 5 down to 1 (inclusive).
Course-book Alignment: Unit 4, page 70    
Problem Statement: Iterate while a condition is true using a while loop.
Sample I/O:
5
4
3
2
1
Target concept: while loop.*/


public class Q14
{

	public static void main(String[] args)
	{
		int index = 5;
		while (index >=1) {
		  System.out.println(index);
		  index--;
		}

	}

}
