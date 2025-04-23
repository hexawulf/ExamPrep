package gemini25_2;
/*Exercise 18: Standard Constructor
Add a default (standard) constructor to the Dog class. Inside this constructor, initialize the age attribute to 0 and the name attribute to "Unnamed". In your Kennel class's main method, create a Dog object using this constructor and print its initial name and age (you will need to add getter methods for this, or temporarily change visibility for testing).
Course-book Alignment: Unit 7, page 104    
Problem Statement: Define and use a standard constructor to initialize object attributes with default values.
Target concept: Standard constructors.*/

public class Q18
{

	public static void main(String[] args)
	{
		Dog puppy8 = new Dog();
		String pupName = puppy8.getName();
		int pupAge = puppy8.getAge();
		System.out.println(puppy8.toString());
		System.out.println("Puppy8's name: " + pupName);
		System.out.println("Puppy8's age: " + pupAge);// TODO Auto-generated method stub
		

	}

}
