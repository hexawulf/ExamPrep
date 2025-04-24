package chatGPT2;
//Exercise 7: Conditional Logic
//Task: Write a method isAdult(int age) that returns true if age is 18 or more.
//Course-book alignment: Unit 4, Section 4.4 (Page 64)
//Target concept: if-else conditional structure

public class Q07
{

	
	
	public static void main(String[] args)
	{

		
		// Test the method
		int age = 20;
		System.out.println("Is " + age + " an adult? " + isAdult(age));
	
	} // end of main
	
	// Method to check if the person is an adult
	public static boolean isAdult(int age) {
		
		if (age >= 18) { 
			return true;}
		else {
			return false;
		}
	}
	
}//end of class
