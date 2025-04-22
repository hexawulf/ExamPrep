package gemini25;
//Exercise 16: Using Public Visibility
//In the Dog class, make the name attribute public and access it directly from another class in a different package. (Note: This is generally not good practice, but demonstrates public visibility).
//
//Course-book alignment: Unit 4, Section 4.5 (Page 75)    
//Target concept: Public visibility modifier

public class Q16
{

	public static void main(String[] args)
	{
		org.hexawulf.animals.Dog doggie = new org.hexawulf.animals.Dog("Wulfie", 3);
		System.out.println(doggie.name);
	}

}
