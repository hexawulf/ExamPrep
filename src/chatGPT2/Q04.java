package chatGPT2;
/*Exercise 4: Using the Main Method
Task: In a new class DogTest, use the main method to create a Dog object and print its name and age.
Course-book alignment: Unit 3, Section 3.5 (Page 51)
Target concept: Main method as entry point*/

public class Q04
{

	public static void main(String[] args)
	{
		Dog dog4 = new Dog();
		dog4.setName("Fluffy");
		dog4.setAge(104);
		System.out.println(dog4.getName());
		System.out.println(dog4.getAge());	

	}

}
