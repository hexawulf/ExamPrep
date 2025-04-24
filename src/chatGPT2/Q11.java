package chatGPT2;
/*Exercise 11: Getter and Setter
Task: Add a setter method setName(String newName) to the Dog class.
Course-book alignment: Unit 3, Section 3.4 (Page 44)
Target concept: Setter method and encapsulation
*/

public class Q11
{

	public static void main(String[] args)
	{
		Dog dog5 = new Dog();
		dog5.setName("Hexawulf");
		dog5.setBreed("Werewolf");
		System.out.println(dog5.getName() + " is a " + dog5.getBreed() + ".");

	}

}
