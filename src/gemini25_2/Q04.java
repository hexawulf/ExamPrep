package gemini25_2;
/*Exercise 4: The Main Method
Create a new class called Kennel with a main method. Inside the main method, create an instance of the Dog class and call its bark() and sleep() methods.
Course-book Alignment: Unit 3, page 51    
Problem Statement: Create a class with a main method to instantiate a Dog object and invoke its methods.
Target concept: The main method.*/

public class Q04
{

	public static void main(String[] args)
	{
		Dog puppy5 =new Dog();
		System.out.println(puppy5);
		puppy5.bark();
		puppy5.sleep();
	}

}
