package chatGPT;

public class Q08
{

	public static void main(String[] args)
	{
//8. Multiplication Table
//Topic: Nested for loops
//Task: Print multiplication table up to a given number.
//Input: 3
//Output:
//1x1=1 1x2=2 1x3=3
//2x1=2 2x2=4 2x3=6
//3x1=3 3x2=6 3x3=9
//Target Concept: Loop nesting.
		int N = 10; // Change this value to generate a multiplication table for a different number

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + " ");
			}
			System.out.println(); // Move to the next line after each row
		}

	}

}
