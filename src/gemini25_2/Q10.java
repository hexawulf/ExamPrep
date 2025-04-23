package gemini25_2;
/*Exercise 10: String Concatenation
Write a Java program (in a main method) that declares two string variables, greeting with the value "Hello" and name with the value "Student". Concatenate these two strings with a space in between and print the resulting string.
Course-book Alignment: Unit 4, page 64    
Problem Statement: Combine two strings into a single string using the concatenation operator.
Sample I/O:
Hello Student
Target concept: String concatenation.

*/

public class Q10
{

	public static void main(String[] args)
	{
		String greeting, name;
		greeting ="Hello";
		name="Student";
		String concat = greeting + " " + name;
		System.out.println(concat);

	}

}
