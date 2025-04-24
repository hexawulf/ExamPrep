package chatGPT2;
/*Exercise 9: While Loop Practice
Task: Write a method countdown() that counts down from 5 to 1.
Course-book alignment: Unit 4, Section 4.4 (Page 69)
Target concept: While loop*/


public class Q09
{

	public static void main(String[] args)
	{
	countdown();
		
	} // end of main
	
	public static void countdown() {

		int index =5;
		while (index >=1) {
		System.out.println(index);
		index--;
		}
	} // end of countdown

} // end of class
