package chatGPT2;
/*16. Use of public Modifier
Problem: Make a public attribute and access it directly from another class in a different package.
Course-book alignment: Unit 4.5 (Visibility Modifiers), Page 75
Target concept: Public access modifier*/

public class Q16
{

	public static void main(String[] args)
	{
		PublicCustomer c1 = new PublicCustomer();
		c1.setName("0xWulf");
		c1.setAge(54);
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println("!!Careful - both name and age fields are set to public in the Customer class!!");

	}

}
