package chatGPT;
import java.util.Scanner;
public class Q02
{

	public static void main(String[] args)
	{
//2. Celsius to Fahrenheit
//Topic: Variables & Arithmetic
//Task: Prompt the user to enter a temperature in Celsius and convert it to Fahrenheit.
//Input: 0
//Output: 32.0°F
//Target Concept: Arithmetic operations and variables.
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a temperature in Celsius to convert to Fahrenheit:");
			double celsius = scanner.nextDouble();
			double fahrenheit = (9.0 / 5) * celsius + 32;
			System.out.println(celsius + " Celsius converted is " + fahrenheit + " degrees Fahrenheit.");
			scanner.close();
			}
		}
}
