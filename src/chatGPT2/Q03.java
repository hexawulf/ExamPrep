package chatGPT2;
/*Exercise 3: Add Methods
Task: Add two methods to the Dog class: getName() and getAge() to return the respective values.
Course-book alignment: Unit 3, Section 3.4 (Page 44)
Target concept: Instance methods and encapsulation
*/

public class Q03
{

	public static void main(String[] args)
	{
		Dog dog3 = new Dog();
		dog3.setName("Buddy");
		dog3.setAge(5);
		String dogName = dog3.getName();
		int dogAge = dog3.getAge();
		System.out.println("Dog's name: " + dogName);
		System.out.println("Dog's age: " + dogAge);
		
		String dog3String = dog3.toString();
		System.out.println(dog3String);

	}

}
