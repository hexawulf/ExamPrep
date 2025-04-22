package gemini25;
//Exercise 2: Adding Attributes to a Class
//Add two attributes to the Dog class: name (String) and age (int). Use private visibility modifiers.
//
//Course-book alignment: Unit 3, Section 3.3 (Page 42)    
//Target concept: Class attributes and visibility modifiers



public class Q02
{

	public static void main(String[] args)
	{
		Dog doggy = new Dog(); // Create an instance of the Dog class
		Dog doggy2 = new Dog("Buddy", 5); // Create another instance of the Dog class with name and age
		System.out.println("Dog object created with defaults: " + doggy); // Print the Dog object
		System.out.println("Dog object created with name and age: " + doggy2); // Print the Dog object

	}

}
