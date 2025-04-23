package gemini25_2;
/*Exercise 19: Overloading Constructors
Add a second constructor to the Dog class that takes a String parameter for the name and an int parameter for the age. This constructor should initialize the name and age attributes with the provided values. In your Kennel class's main method, create a second Dog object using this overloaded constructor with sample values and print its name and age.
Course-book Alignment: Unit 7, page 107    
Problem Statement: Define an overloaded constructor to allow object creation with initial values provided as arguments.
Target concept: Overloaded constructors.*/

public class Q19
{

	public static void main(String[] args)
	{
		Dog puppy10 = new Dog("0xWulf", 54);
		System.out.println("The new dog is called: " + puppy10.getName() + " and its age is: " + puppy10.getAge() + ".");
	}

}
