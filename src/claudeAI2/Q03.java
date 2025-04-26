package claudeAI2;
/*Exercise 3: Creating Objects
Write a Java main method that creates two Rectangle objects. The Rectangle class has two attributes: width and height. Set different values for each object's attributes and print them to the console.
Target concept: Object creation and attribute assignment (Unit 3, Section 3.5, pp. 51-54)*/

public class Q03
{

	public static void main(String[] args)
	{
		Rectangle rc = new Rectangle(10,5);
		System.out.println(rc);
		Rectangle rc2 = new Rectangle(25,10);
		System.out.println(rc2);

	}

}
