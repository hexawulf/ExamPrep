package gemini25_2;
/*Exercise 17: Public Visibility Modifier for Methods
Modify the Dog class. Ensure the bark() and sleep() methods are declared with the public visibility modifier so they can be accessed from the Kennel class.
Course-book Alignment: Unit 4, page 75    
Problem Statement: Apply the public access modifier to class methods to allow external access.
Target concept: public visibility modifier for methods.*/

public class Q17
{

	public static void main(String[] args)
	{
		Dog puppy6 = new Dog();
		puppy6.bark();
		puppy6.sleep();
		System.out.println(puppy6.toString());

	}

}
