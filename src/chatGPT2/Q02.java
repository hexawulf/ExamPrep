package chatGPT2;
/*Exercise 2: Add Attributes
Task: Extend the Dog class by adding two attributes: name (String) and age (int).
Course-book alignment: Unit 3, Section 3.3 (Page 42)
Target concept: Defining instance attributes*/

public class Q02
{

	public static void main(String[] args)
	{
		Dog dog2 = new Dog();
		dog2.name = "Buddy";
		dog2.age = 5;
		String dog2String = dog2.toString();
		System.out.println(dog2String);

	}

}
