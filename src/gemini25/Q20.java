package gemini25;
//Exercise 20: Constructor Overloading
//In the Dog class, add a second constructor that takes a String parameter for the dog's name and an int parameter for the age, and initializes the attributes.
//
//Course-book alignment: Unit 7, Section 7.2 (Page 107)    
//Target concept: Constructor overloading
public class Q20
{

	public static void main(String[] args)
	{
		org.hexawulf.animals.Dog doggie = new org.hexawulf.animals.Dog("0xWulf", 1);
		System.out.println("doggie: " + doggie);

	}

}
