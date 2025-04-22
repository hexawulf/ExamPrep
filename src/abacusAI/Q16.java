package abacusAI;
import java.util.Scanner;
public class Q16
{

	public static void main(String[] args)
	{
//		16. User Input (Scanner)
//		Problem:
//		Write a program that reads a user's name from the console and prints "Hello, [name]!".
//
//		Example Input:
//		Alice
//		Example Output:
//		Hello, Alice!
//
//		Targeted Concept:
//		User Input – Using Scanner to read input from the user.
Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine(); // Read user input
		System.out.println("Hello, " + name + "!"); // Print greeting
		scanner.close(); // Close the scanner to prevent resource leaks
		// Note: It's a good practice to close the scanner when done.
		// However, if you close System.in, you cannot read from it again in the same program.
		// In this simple example, it's fine to close it.
	}

}
