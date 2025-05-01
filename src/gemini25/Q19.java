package gemini25;
//Exercise 19: Using a Standard Constructor
//Add a public no-argument constructor to the Dog class that prints "A new dog is created!" when an object is instantiated.
//
//Course-book alignment: Unit 7, Section 7.1 (Page 104)    
//Target concept: Standard constructor
public class Q19
{

	public static void main(String[] args)
	{
		dev.hexawulf.animals.Dog doggie = new dev.hexawulf.animals.Dog();
		System.out.println("doggie: " + doggie);
	}

}
