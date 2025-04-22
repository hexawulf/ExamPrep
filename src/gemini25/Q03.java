package gemini25;
//Exercise 3: Implementing Getter Methods
//For the Dog class with name and age attributes, add public getter methods getName() and getAge() to retrieve their values.
//
//Course-book alignment: Unit 3, Section 3.4 (Page 44)    
//Target concept: Getter methods

public class Q03
{

	public static void main(String[] args)
	{
		Dog doggie = new Dog(); // Create an instance of the Dog class
		System.out.println(doggie.getDogName());
		System.out.println(doggie.getDogAge());

	}

}
